plugins {
  alias(libs.plugins.io.github.khalilou88.jnxplus)
  // this is necessary to avoid the plugins to be loaded multiple times
  // in each subproject's classloader
  // kotlin
  alias(libs.plugins.org.jetbrains.kotlin.jvm) apply false
  alias(libs.plugins.org.jetbrains.kotlin.plugin.allopen) apply false
  // spring
  alias(libs.plugins.org.springframework.boot) apply false
  alias(libs.plugins.io.spring.dependency.management) apply false
  alias(libs.plugins.org.jetbrains.kotlin.plugin.spring) apply false
  // quarkus
  alias(libs.plugins.io.quarkus) apply false
  // micronaut
  alias(libs.plugins.io.micronaut.application) apply false
  alias(libs.plugins.io.micronaut.library) apply false
  alias(libs.plugins.io.micronaut.aot) apply false
  alias(libs.plugins.com.google.devtools.ksp) apply false
  alias(libs.plugins.com.github.johnrengelman.shadow) apply false
}
