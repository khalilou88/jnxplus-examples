plugins {
  alias(libs.plugins.github.khalilou88.jnxplus)
  // this is necessary to avoid the plugins to be loaded multiple times
  // in each subproject's classloader
  // kotlin
  alias(libs.plugins.jetbrains.kotlin.jvm) apply false
  alias(libs.plugins.jetbrains.kotlin.plugin.allopen) apply false
  // ktlint
  alias(libs.plugins.jlleitschuh.gradle.ktlint) apply false
  // spring
  alias(libs.plugins.springframework.boot) apply false
  alias(libs.plugins.spring.dependency.management) apply false
  alias(libs.plugins.jetbrains.kotlin.plugin.spring) apply false
  // quarkus
  alias(libs.plugins.quarkus) apply false
  // micronaut
  alias(libs.plugins.micronaut.application) apply false
  alias(libs.plugins.micronaut.library) apply false
  alias(libs.plugins.micronaut.aot) apply false
  alias(libs.plugins.google.devtools.ksp) apply false
  alias(libs.plugins.github.johnrengelman.shadow) apply false
}
