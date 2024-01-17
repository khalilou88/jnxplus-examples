import org.jetbrains.kotlin.gradle.dsl.JvmTarget




plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.com.google.devtools.ksp)
    alias(libs.plugins.io.micronaut.library)

}

version = "0.0.1-SNAPSHOT"
group = "com.example"


repositories {
    mavenCentral()
}

dependencies {
    implementation(mn.micronaut.kotlin.runtime)
    implementation(libs.org.jetbrains.kotlin.kotlin.reflect)
    implementation(libs.org.jetbrains.kotlin.kotlin.stdlib.jdk8)
    testImplementation(mn.micronaut.test.junit5)
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
    sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
}
