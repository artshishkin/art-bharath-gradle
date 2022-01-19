package net.shyshkin.study.gradle.plugins

import org.gradle.api.Project
import org.gradle.api.Plugin

public class MyAWSPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("copyToS3") {
            doLast {
                println "Copied to S3"
            }
        }

        project.task("deployToEC2") {
            doLast {
                println "Deployed to EC2"
            }
        }
    }
}