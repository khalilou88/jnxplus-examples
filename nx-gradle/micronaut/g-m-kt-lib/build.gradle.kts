plugins {
  alias(libs.plugins.jetbrains.kotlin.jvm)
  alias(libs.plugins.google.devtools.ksp)
  alias(libs.plugins.micronaut.library)

}

version = "0.0.1-SNAPSHOT"
group = "com.example"


repositories {
  mavenCentral()
}

dependencies {
  implementation(mn.micronaut.kotlin.runtime)
  implementation(mn.kotlin.reflect)
  implementation(mn.kotlin.stdlib.jdk8)
  testImplementation(mn.micronaut.test.junit5)
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
  sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
}
