val javaVersion: String by project

plugins {
    alias(libs.plugins.io.micronaut.library)
}

version = "0.0.1-SNAPSHOT"
group = "com.example"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.micronaut.test:micronaut-test-junit5")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
    sourceCompatibility = libs.versions.java.get()
    targetCompatibility = libs.versions.java.get()
}
