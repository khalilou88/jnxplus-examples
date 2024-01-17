val javaVersion: String by project
val quarkusVersion: String by project

plugins {
    java
    alias(libs.plugins.io.quarkus)
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}"))
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}

group "com.example"
version "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = libs.versions.java.get()
    targetCompatibility = libs.versions.java.get()
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}

