

plugins {
	java
	alias(libs.plugins.org.springframework.boot) apply false
	alias(libs.plugins.io.spring.dependency.management)
  checkstyle
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
}

repositories {
	mavenCentral()
}

dependencyManagement {
	imports {
		mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
  useJUnitPlatform()
}

checkstyle {
  toolVersion = "10.3.3"
  configFile = rootProject.file("config/checkstyle/checkstyle.xml")
}
