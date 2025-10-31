//test comment

plugins {
    // Apply the plugin by its ID. The version is managed in the root build file.
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.lab08"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.lab08"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    testImplementation("org.junit.jupiter:junit-jupiter-api:6.0.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:6.0.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}