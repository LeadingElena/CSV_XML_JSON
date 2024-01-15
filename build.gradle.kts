plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.opencsv:opencsv:5.9")
    implementation ("com.googlecode.json-simple:json-simple:1.1.1")
    implementation ("com.google.code.gson:gson:2.10.1")
}

tasks.test {
    useJUnitPlatform()
}