plugins {
    kotlin("jvm") version "2.0.21"
}

group = "nl.blitz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin stdlib
    implementation(kotlin("stdlib"))
    
    // Use Kotlin test library
    testImplementation(kotlin("test"))
    
    // JUnit 5 (Jupiter) for all tests
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}