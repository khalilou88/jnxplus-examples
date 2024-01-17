import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val javaVersion: String by project

plugins {
  alias(libs.plugins.springframework.boot) apply false
  alias(libs.plugins.spring.dependency.management)
  alias(libs.plugins.jetbrains-kotlin-jvm)
  alias(libs.plugins.jetbrains-kotlin-plugin-spring)
  id("org.jlleitschuh.gradle.ktlint") version "12.0.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = libs.versions.java.get()
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
