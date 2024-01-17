val javaVersion: String by project
val quarkusVersion: String by project

plugins {
    alias(libs.plugins.jetbrains-kotlin-jvm)
    kotlin("plugin.allopen")
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = libs.versions.java.get()
    targetCompatibility = libs.versions.java.get()
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}

allOpen {
    annotation("jakarta.enterprise.context.ApplicationScoped")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = javaVersion
    kotlinOptions.javaParameters = true
}

