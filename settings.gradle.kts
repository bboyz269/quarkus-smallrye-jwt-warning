pluginManagement {
    val quarkusVersion: String by settings
    val kotlinVersion: String by settings
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("io.quarkus") version quarkusVersion apply false
        kotlin("jvm") version kotlinVersion apply false
        kotlin("plugin.allopen") version kotlinVersion apply false
    }
}

rootProject.name = "quarkus-smallrye-jwt-warning"
