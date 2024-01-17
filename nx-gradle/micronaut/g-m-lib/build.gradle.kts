plugins {
    alias(libs.plugins.micronaut.library)
}

version = "0.0.1-SNAPSHOT"
group = "com.example"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(mn.micronaut.test.junit5)
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
    sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
    targetCompatibility = JavaVersion.toVersion(libs.versions.java.get())
}
