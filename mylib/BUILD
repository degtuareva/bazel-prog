load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "mylib",
    srcs = glob(["src/main/java/**/*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "@maven//:org_apache_commons_commons_lang3",
    ],
)
