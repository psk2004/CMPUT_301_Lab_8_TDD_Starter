// In your TOP-LEVEL build.gradle.kts (e.g., /Lab08/build.gradle.kts)

// The 'plugins' block is the modern, correct way to apply plugins.
plugins {
    // Apply the Android Application plugin and specify its version
    id("com.android.application") version "8.13.0" apply false

    // Apply the Android Library plugin if you have library modules
    id("com.android.library") version "8.13.0" apply false

    // Apply the Kotlin Android plugin
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
