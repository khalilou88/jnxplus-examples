pluginManagement {
  val springBootVersion: String by settings
  val springDependencyManagementVersion: String by settings
  val quarkusVersion: String by settings
  val micronautVersion: String by settings
  val kspVersion: String by settings
  val shadowVersion: String by settings
  val kotlinVersion: String by settings
  val jnxplusGradlePluginVersion: String by settings
  plugins {
    id("org.springframework.boot") version springBootVersion
    id("io.spring.dependency-management") version springDependencyManagementVersion
    id("io.quarkus") version quarkusVersion
    id("io.micronaut.application") version micronautVersion
    id("io.micronaut.library") version micronautVersion
    id("io.micronaut.aot") version micronautVersion
    id("com.google.devtools.ksp") version kspVersion
    id("com.github.johnrengelman.shadow") version shadowVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
    id("io.github.khalilou88.jnxplus") version jnxplusGradlePluginVersion
  }
}
rootProject.name = "root-project"
include(":spring-boot:g-sb-app")
include(":spring-boot:g-sb-lib")
include(":spring-boot:g-sb-kt-app")
include(":spring-boot:g-sb-kt-lib")
include(":quarkus:g-q-app")
include(":quarkus:g-q-lib")
include(":quarkus:g-q-kt-app")
include(":quarkus:g-q-kt-lib")
include(":micronaut:g-m-app")
include(":micronaut:g-m-lib")
include(":micronaut:g-m-kt-app")
include(":micronaut:g-m-kt-lib")
