rootProject.name = "buildSrc"

dependencyResolutionManagement {
    versionCatalogs {
        create("lib") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
