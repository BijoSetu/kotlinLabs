plugins {
    kotlin("jvm") version "2.0.10"
    id("org.jetbrains.dokka") version "1.9.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.9.20")
    implementation("io.github.oshai:kotlin-logging-jvm:5.1.4")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("org.slf4j:slf4j-simple:2.0.16")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}