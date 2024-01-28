import { normalizePath, workspaceRoot } from "@nx/devkit";
import { execSync } from "child_process";

function showProjectJson(projectName: string) {
  const result = execSync(`nx show project ${projectName} --json`, {
    cwd: workspaceRoot,
    env: process.env,
    encoding: "utf8",
    stdio: "pipe",
    windowsHide: true,
  })
    .toString()
    .trim();

  //console.log(result);
  return JSON.parse(result);
}

describe("nx-maven tests", () => {
  it("should show build-tools config", () => {
    const libName = "build-tools";
    const projectJson = showProjectJson(libName);
    expect(Object.entries(projectJson.targets).length).toBe(1);
    expect(projectJson.targets.build.outputs).toEqual([
      "{projectRoot}/target",
      "{options.outputDirLocalRepo}",
    ]);
    expect(
      normalizePath(projectJson.targets.build.options.outputDirLocalRepo),
    ).toBe(`nx-maven/.m2/repository/com/example/${libName}/1.0`);
  });

  it("should show root-parent-project config", () => {
    const projectName = "root-parent-project";
    const projectJson = showProjectJson(projectName);
    expect(Object.entries(projectJson.targets).length).toBe(1);
    expect(projectJson.targets.build.outputs).toContain(
      "{options.outputDirLocalRepo}",
    );
    expect(
      normalizePath(projectJson.targets.build.options.outputDirLocalRepo),
    ).toBe(`nx-maven/.m2/repository/com/example/${projectName}/0.0.0`);
  });

  it("should show m-sb-parent-project config", () => {
    const projectName = "m-sb-parent-project";
    const projectJson = showProjectJson(projectName);
    expect(Object.entries(projectJson.targets).length).toBe(1);
    expect(projectJson.targets.build.outputs).toContain(
      "{options.outputDirLocalRepo}",
    );
    expect(
      normalizePath(projectJson.targets.build.options.outputDirLocalRepo),
    ).toBe(`nx-maven/.m2/repository/com/example/${projectName}/0.0.0-SNAPSHOT`);
  });

  it("should show m-sb-app config", () => {
    const appName = "m-sb-app";
    const projectJson = showProjectJson(appName);
    expect(Object.entries(projectJson.targets).length).toBe(5);
    expect(projectJson.targets.build.outputs).toContain("{projectRoot}/target");
    expect(projectJson.targets.build.options.outputDirLocalRepo).toBeFalsy();
  });

  it("should show m-sb-kt-app config", () => {
    const appName = "m-sb-kt-app";
    const projectJson = showProjectJson(appName);
    expect(Object.entries(projectJson.targets).length).toBe(6);
    expect(projectJson.targets.build.outputs).toContain("{projectRoot}/target");
    expect(projectJson.targets.build.options.outputDirLocalRepo).toBeFalsy();
  });

  it("should show m-sb-kt-lib config", () => {
    const libName = "m-sb-kt-lib";
    const projectJson = showProjectJson(libName);
    expect(Object.entries(projectJson.targets).length).toBe(4);
    expect(projectJson.targets.build.outputs).toContain("{projectRoot}/target");
    expect(projectJson.targets.build.outputs).toContain(
      "{options.outputDirLocalRepo}",
    );
    expect(
      normalizePath(projectJson.targets.build.options.outputDirLocalRepo),
    ).toBe(`nx-maven/.m2/repository/com/example/${libName}/0.0.0-SNAPSHOT`);
  });

  it("should show m-sb-lib config", () => {
    const libName = "m-sb-lib";
    const projectJson = showProjectJson(libName);
    expect(Object.entries(projectJson.targets).length).toBe(4);
    expect(projectJson.targets.build.outputs).toContain("{projectRoot}/target");
    expect(projectJson.targets.build.outputs).toContain(
      "{options.outputDirLocalRepo}",
    );
    expect(
      normalizePath(projectJson.targets.build.options.outputDirLocalRepo),
    ).toBe(`nx-maven/.m2/repository/com/example/${libName}/0.0.0-SNAPSHOT`);
    expect(
      normalizePath(
        projectJson.targets["target-with-outputDirLocalRepo"].options
          .outputDirLocalRepo,
      ),
    ).toBe(`nx-maven/.m2/repository/com/example/${libName}/0.0.0-SNAPSHOT`);
  });

  it("should show m-n-lib config", () => {
    const libName = "m-n-lib";
    const projectJson = showProjectJson(libName);
    expect(Object.entries(projectJson.targets).length).toBe(2);
    expect(projectJson.targets.build.outputs).toEqual([
      "{projectRoot}/target",
      "{options.outputDirLocalRepo}",
    ]);
    expect(
      normalizePath(projectJson.targets.build.options.outputDirLocalRepo),
    ).toBe(`nx-maven/.m2/repository/fr/example/${libName}/1.2.3`);
  });
});
