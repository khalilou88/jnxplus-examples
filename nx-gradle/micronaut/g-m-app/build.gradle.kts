

plugins {
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
    annotationProcessor(mn.micronaut.serde.processor)
    implementation(mn.micronaut.serde.jackson)
    runtimeOnly(libs.ch.qos.logback.logback.classic)
    testImplementation(libs.io.micronaut.micronaut.http.client)
    implementation(project(":micronaut:g-m-lib"))
}


application {
    mainClass.set("com.example.gmapp.Application")
}

java {
    sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
    targetCompatibility = JavaVersion.toVersion(libs.versions.java.get())
}

graalvmNative.toolchainDetection.set(false)

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("com.example.gmapp.*")
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
