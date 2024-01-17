plugins {
  alias(libs.plugins.github.khalilou88.jnxplus)
  alias(libs.plugins.jetbrains-kotlin-jvm) apply false
  kotlin("plugin.allopen") apply false
  alias(libs.plugins.springframework.boot) apply false
  alias(libs.plugins.spring.dependency.management) apply false
  alias(libs.plugins.jetbrains-kotlin-plugin-spring) apply false
  id("io.quarkus") apply false
  id("com.github.johnrengelman.shadow") apply false
  id("io.micronaut.application") apply false
  id("io.micronaut.aot") apply false
  id("com.google.devtools.ksp") apply false
}
