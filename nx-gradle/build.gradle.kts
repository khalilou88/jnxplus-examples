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
  alias(libs.plugins.io.quarkus) apply false
  // micronaut
  alias(libs.plugins.io.micronaut.application) apply false
  alias(libs.plugins.io.micronaut.library) apply false
  alias(libs.plugins.io.micronaut.aot) apply false
  alias(libs.plugins.com.google.devtools.ksp) apply false
  alias(libs.plugins.com.github.johnrengelman.shadow) apply false
}
