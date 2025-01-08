plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.crud_abiel"
    compileSdk = 27

    defaultConfig {
        applicationId = "com.example.crud_abiel"
        minSdk = 25
        targetSdkVersion = 27
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'){
        }
    }
        buildToolVersion = '27.0.0'
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation fileTree(dir: 'libs', include: ['*.jar'])

    implementation 'androidx.appcombat:appcombat:1.1.0'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
    androidTestImplementation 'androidx.test.espresso:espresso'

    implementation 'com.android.support:appcombat-v7:28.0.0'
    implementation 'com.android'
}