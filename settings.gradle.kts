pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }

    plugins {
        val kotlinVersion = extra["kotlin.version"] as String

        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        kotlin("android").version(kotlinVersion)

        val agpVersion = extra["agp.version"] as String
        id("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)

        val composeVersion = extra["compose.version"] as String
        id("org.jetbrains.compose").version(composeVersion)

        val kspVersion = extra["ksp.version"] as String
        id("com.google.devtools.ksp").version(kspVersion)

        val nativesCoroutinesVersion = extra["nativecoroutines.version"] as String
        id("com.rickclephas.kmp.nativecoroutines").version(nativesCoroutinesVersion)
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}


rootProject.name = "Mastard"
include(":androidApp")
include(":sharedUi")