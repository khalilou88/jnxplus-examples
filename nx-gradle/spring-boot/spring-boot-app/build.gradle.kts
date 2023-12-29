val javaVersion: String by project

plugins {
	java
	id("org.springframework.boot")
	id("io.spring.dependency-management")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.toVersion(javaVersion)
}

repositories {
	mavenCentral()
}

dependencies {
  	implementation("org.springframework.boot:spring-boot-starter-web")
  	testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(project(":spring-boot:spring-boot-lib"))
}

tasks.withType<Test> {
  useJUnitPlatform()
}
