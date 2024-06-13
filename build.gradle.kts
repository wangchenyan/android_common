// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.4.1" apply false
    id("com.android.library") version "8.4.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
}

buildscript {
    dependencies {
        classpath("com.github.wangchenyan.crouter:crouter-plugin:3.0.0-beta01")
    }
}