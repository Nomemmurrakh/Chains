plugins {
    alias(libs.plugins.jvm)

    `java-library`
}

group = "com.nomemmurrakh"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    testImplementation(libs.junit.jupiter.engine)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    api(libs.commons.math3)

    implementation(libs.guava)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}