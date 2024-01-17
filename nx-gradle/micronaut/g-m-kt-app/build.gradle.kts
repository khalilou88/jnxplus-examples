import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val javaVersion: String by project
val kotlinVersion: String by project

plugins {
    alias(libs.plugins.org.jetbrains.kotlin.jvm)
    alias(libs.plugins.org.jetbrains.kotlin.plugin.allopen)
    alias(libs.plugins.com.google.devtools.ksp)
    alias(libs.plugins.com.github.johnrengelman.shadow)
    alias(libs.plugins.io.micronaut.application)
    alias(libs.plugins.io.micronaut.aot)
}

version = "0.0.1-SNAPSHOT"
group = "com.example"


repositories {
    mavenCentral()
}

dependencies {
    ksp("io.micronaut.serde:micronaut-serde-processor")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation("io.micronaut.serde:micronaut-serde-jackson")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    runtimeOnly("ch.qos.logback:logback-classic")
    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")
    testImplementation("io.micronaut:micronaut-http-client")
    runtimeOnly("org.yaml:snakeyaml")
    implementation(project(":micronaut:g-m-kt-lib"))
}

application {
    mainClass.set("com.example.gmktapp.ApplicationKt")
}

java {
    sourceCompatibility = libs.versions.java.get()
}

graalvmNative.toolchainDetection.set(false)

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("com.example.gmktapp.*")
    }
    aot {
    // Please review carefully the optimizations enabled below
    // Check https://micronaut-projects.github.io/micronaut-aot/latest/guide/ for more details
        optimizeServiceLoading.set(false)
        convertYamlToJava.set(false)
        precomputeOperations.set(true)
        cacheEnvironment.set(true)
        optimizeClassLoading.set(true)
        deduceEnvironment.set(true)
        optimizeNetty.set(true)
    }
}
