plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid)
//    alias(libs.plugins.kotlinParcelize)
//    alias(libs.plugins.jetbrainsKotlinSerialization)
//    alias(libs.plugins.kotlinKapt)
}

android {
    namespace = "com.example.and102_bitfit_2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.and102_bitfit_2"
        minSdk = 33
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
//    implementation(libs.org.jetbrains.kotlin.stdlib)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
//    implementation(libs.google.android.material)
    implementation(libs.androidx.constraintlayout)
//    implementation(libs.codepath.libraries.asynchttpclient)
//    implementation(libs.androidx.recyclerview.recyclerview)
//    implementation(libs.androidx.recyclerview.recyclerviewSelection)
//    implementation(libs.github.bumptech.glide.glide)
//    implementation(libs.google.code.gson)
//    implementation(libs.jetbrains.kotlinx.serialization.json)
//    kapt(libs.github.bumptech.glide.compiler)
    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.test.ext.junit)
//    androidTestImplementation(libs.androidx.test.espresso.espressoCore)
//    implementation(libs.androidx.room.runtime)
//    implementation(libs.androidx.room.ktx)
//    kapt(libs.androidx.room.compiler)
//    implementation(libs.androidx.fragment.fragmentKtx)
}