import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val javaVersion: String by project
val kotlinVersion: String by project

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.google.devtools.ksp")
    id("io.micronaut.library")
}

version = "0.0.1-SNAPSHOT"
group = "com.example"


repositories {
    mavenCentral()
}

dependencies {
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    testImplementation("io.micronaut.test:micronaut-test-junit5")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
    sourceCompatibility = JavaVersion.toVersion(javaVersion)
}
