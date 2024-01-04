pluginManagement {
  val springBootVersion: String by settings
  val springDependencyManagementVersion: String by settings
  val quarkusVersion: String by settings
  val kotlinVersion: String by settings
  val jnxplusGradlePluginVersion: String by settings
  plugins {
    id("org.springframework.boot") version springBootVersion
    id("io.spring.dependency-management") version springDependencyManagementVersion
    id("io.quarkus") version quarkusVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
    id("io.github.khalilou88.jnxplus") version jnxplusGradlePluginVersion
  }
}
rootProject.name = "root-project"
include(":quarkus:g-q-lib")
include(":quarkus:g-q-kt-lib")
include(":quarkus:g-q-kt-app")
include(":spring-boot:g-sb-app")
include(":spring-boot:g-sb-lib")
include(":spring-boot:g-sb-kt-app")
include(":spring-boot:g-sb-kt-lib")
include(":quarkus:g-q-app")
