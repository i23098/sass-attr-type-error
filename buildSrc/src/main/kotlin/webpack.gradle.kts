import com.github.gradle.node.npm.task.NpxTask

plugins {
    id("node")
}

val webpackTask = tasks.register<NpxTask>("webpack") {
    dependsOn("npmInstall")

    command = "webpack"
    workingDir = project.projectDir;

    inputs.file(project.projectDir.resolve("webpack.config.js"))
    inputs.files(fileTree(rootProject.rootDir.resolve("node_modules")).exclude(".cache"))
}

project.afterEvaluate {
    tasks.getByName("build").dependsOn(webpackTask);
}
