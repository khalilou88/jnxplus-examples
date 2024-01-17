plugins {
	java
	alias(libs.plugins.springframework.boot)
	alias(libs.plugins.spring.dependency.management)
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

dependencies {
  	implementation("org.springframework.boot:spring-boot-starter-web")
  	testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(project(":spring-boot:g-sb-lib"))
}

tasks.withType<Test> {
  useJUnitPlatform()
}

checkstyle {
  toolVersion = libs.versions.checkstyle.get()
  configFile = rootProject.file("config/checkstyle/checkstyle.xml")
}
