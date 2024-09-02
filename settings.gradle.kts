pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
//     plugins {
//        id("com.google.devtools.ksp") version libs.versions.ksp.get()
//    }
}

rootProject.name = "MyReadList"
include(":app")