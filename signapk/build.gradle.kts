plugins {
    application
    alias(libs.plugins.shadow)
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(libs.apksig)
    implementation(libs.bcprov)
    implementation(libs.bcpkix)
    implementation(libs.conscrypt)
}

application {
    mainClass.set("com.android.signapk.SignApk")
}

tasks {
    named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
        addMultiReleaseAttribute = false
    }
}
