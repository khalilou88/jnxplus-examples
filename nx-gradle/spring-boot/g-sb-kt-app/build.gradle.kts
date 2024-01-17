import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  alias(libs.plugins.springframework.boot)
  alias(libs.plugins.spring.dependency.management)
  alias(libs.plugins.jetbrains.kotlin.jvm)
  alias(libs.plugins.jetbrains.kotlin.plugin.spring)
  alias(libs.plugins.jlleitschuh.gradle.ktlint)
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  implementation(project(":spring-boot:g-sb-kt-lib"))
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += "-Xjsr305=strict"
    jvmTarget = libs.versions.java.get()
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
