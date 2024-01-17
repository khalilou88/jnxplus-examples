import org.jetbrains.kotlin.gradle.tasks.KotlinCompile



plugins {
  alias(libs.plugins.org.springframework.boot) apply false
  alias(libs.plugins.io.spring.dependency-management)
  alias(libs.plugins.org.jetbrains.kotlin.jvm)
  alias(libs.plugins.org.jetbrains.kotlin.plugin.spring)
  alias(libs.plugins.org.jlleitschuh.gradle.ktlint)
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
}

repositories {
  mavenCentral()
}

dependencyManagement {
  imports {
    mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
  }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += "-Xjsr305=strict"
    jvmTarget = javaVersion
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
