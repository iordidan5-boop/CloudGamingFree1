plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ro.cloudgamingfree.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "ro.cloudgamingfree.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
