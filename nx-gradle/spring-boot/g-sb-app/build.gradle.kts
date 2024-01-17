val javaVersion: String by project

plugins {
	java
	alias(libs.plugins.org.springframework.boot)
	alias(libs.plugins.io.spring.dependency-management)
  checkstyle
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = libs.versions.java.get()
}

repositories {
	mavenCentral()
}

dependencies {
  	implementation("org.springframework.boot:spring-boot-starter-web")
  	testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(project(":spring-boot:g-sb-lib"))
}

tasks.withType<Test> {
  useJUnitPlatform()
}

checkstyle {
  toolVersion = "10.3.3"
  configFile = rootProject.file("config/checkstyle/checkstyle.xml")
}
