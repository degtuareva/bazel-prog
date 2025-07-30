load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "app",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "org.example.app.Main",
    deps = [
        "//mylib:mylib",
        "@maven//:org_apache_commons_commons_lang3",
    ],
)
