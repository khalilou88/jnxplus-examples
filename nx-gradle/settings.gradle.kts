pluginManagement {
  repositories {
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
  }
}

plugins {
  id("io.micronaut.platform.catalog") version "4.2.1"
}

rootProject.name = "root-project"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
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
include(":kmp:composeApp")
include(":kmp:server")
include(":kmp:shared")
