plugins {
  id("io.github.khalilou88.jnxplus")
  checkstyle apply false
}

checkstyle {
  toolVersion = "10.3.3"
  configFile = rootProject.file("config/checkstyle/checkstyle.xml")
}
