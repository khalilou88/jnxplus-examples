plugins {
  id("io.micronaut.platform.catalog") version "4.2.1"
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
include(":kmp:g-kmp-project")
