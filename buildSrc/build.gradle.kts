plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    // https://plugins.gradle.org/plugin/com.github.node-gradle.node
    implementation("com.github.node-gradle.node:com.github.node-gradle.node.gradle.plugin:7.1.0") // id("com.github.node-gradle.node") version "7.1.0"
}
