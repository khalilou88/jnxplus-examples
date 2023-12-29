pluginManagement {
  val springBootVersion: String by settings
  val springDependencyManagementVersion: String by settings
  val kotlinVersion: String by settings
  val jnxplusGradlePluginVersion: String by settings
  plugins {
    id("org.springframework.boot") version springBootVersion
    id("io.spring.dependency-management") version springDependencyManagementVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("io.github.khalilou88.jnxplus") version jnxplusGradlePluginVersion
  }
}
rootProject.name = "root-project"
include(":spring-boot:g-sb-app")
include(":spring-boot:g-sb-lib")
include(":spring-boot:g-sb-kt-app")
include(":spring-boot:g-sb-kt-lib")
