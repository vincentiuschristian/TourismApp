plugins {
    id("com.android.dynamic-feature")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

apply (from  ="../shared_dependencies.gradle")

android {
    namespace = "com.dicoding.tourismapps.maps"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
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
}

dependencies {
    implementation(project(":app"))
    implementation(project(":core"))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.8.20")
}