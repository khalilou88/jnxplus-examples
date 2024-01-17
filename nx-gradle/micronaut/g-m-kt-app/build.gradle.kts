import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.jetbrains.kotlin.plugin.allopen)
    alias(libs.plugins.google.devtools.ksp)
    alias(libs.plugins.github.johnrengelman.shadow)
    alias(libs.plugins.micronaut.application)
    alias(libs.plugins.micronaut.aot)
}

version = "0.0.1-SNAPSHOT"
group = "com.example"


repositories {
    mavenCentral()
}

dependencies {
    ksp(mn.micronaut.serde.processor)
    implementation(mn.micronaut.kotlin.runtime)
    implementation(mn.micronaut.serde.jackson)
    implementation(mn.kotlin.reflect)
    implementation(mn.kotlin.stdlib.jdk8)
    runtimeOnly(mn.logback.classic)
    runtimeOnly(mn.jackson.module.kotlin)
    testImplementation(mn.micronaut.http.client)
    runtimeOnly(mn.snakeyaml)
    implementation(project(":micronaut:g-m-kt-lib"))
}

application {
    mainClass.set("com.example.gmktapp.ApplicationKt")
}

java {
    sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
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
