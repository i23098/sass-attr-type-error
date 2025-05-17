plugins {
    id("com.github.node-gradle.node")
}

node {
    download = true
    version = "22.15.1"

    workDir = rootProject.layout.buildDirectory.get().dir("nodejs") // where node is downloaded to
    nodeProjectDir = rootProject.rootDir; // where package.json is read and node_modules downloaded
}

tasks.npmInstall {
    inputs.file(rootProject.rootDir.resolve("package.json"));

    val packageLockFile = rootProject.rootDir.resolve("package-lock.json");
    if (packageLockFile.exists()) {
        inputs.file(packageLockFile)
    }

    outputs.file(packageLockFile)
    outputs.dir(rootProject.rootDir.resolve("node_modules"))
}
