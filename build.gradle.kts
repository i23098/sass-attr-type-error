import com.github.gradle.node.npm.task.NpxTask

plugins {
    war
    id("webpack")
}

tasks.getByName<NpxTask>("webpack") {
    dependsOn("npmInstall")

    val outputDir = project.layout.buildDirectory.dir("webpack-js");
    val relativeOutputDir = "." + File.separatorChar + outputDir.get().asFile.relativeTo(project.projectDir)

    args = listOf(
        "--env=outputDir=$relativeOutputDir"
    )

    inputs.dir(project.projectDir.resolve("src/main/react-js"))
    outputs.dir(outputDir)
}

tasks.war {
    dependsOn("webpack")
    
    from(project.layout.buildDirectory.dir("webpack-js")) {
        into("js")
    }
}
