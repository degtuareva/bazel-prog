load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    name = "maven",
    artifacts = [
        "org.apache.commons:commons-lang3:3.18.0",
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)
