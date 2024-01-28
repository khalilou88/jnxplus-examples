import { normalizePath, workspaceRoot } from "@nx/devkit";
import { execSync } from "child_process";

function showProjectJson(projectName: string) {
  const a = execSync(`nx show project ${projectName} --json`, {
    cwd: workspaceRoot,
    env: process.env,
    encoding: "utf8",
    stdio: "pipe",
  })
    .toString()
    .trim();

  console.log(a);
  return JSON.parse(a);
}

describe("nx-maven tests", () => {
  it("should work", () => {
    const libName = "build-tools";
    const projectJson = showProjectJson(libName);
    expect(Object.entries(projectJson.targets).length).toBe(1);
    expect(projectJson.targets.build.outputs).toEqual([
      "{projectRoot}/target",
      "{options.outputDirLocalRepo}",
    ]);
    expect(projectJson.targets.build.options.outputDirLocalRepo).toBeTruthy();
    expect(
      normalizePath(projectJson.targets.build.options.outputDirLocalRepo),
    ).toBe("nx-maven/.m2/repository/com/example/build-tools/1.0");
  });
});
