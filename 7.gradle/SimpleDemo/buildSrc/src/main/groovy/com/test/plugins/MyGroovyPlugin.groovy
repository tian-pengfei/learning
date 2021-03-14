package com.test.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class GreetingPluginExtension {
    String name="Tom"
    String message = 'Hello from GreetingPlugin'
}


 class MyGroovyPlugin implements Plugin<Project> {


    @Override
    public void apply(Project project) {

        println "hello MyGroovyPlugin"









        def extension = project.extensions.create('greeting', GreetingPluginExtension)
        println "hi ${extension.name},${extension.message}"

        project.task('hello') {
            doLast {
               println "hi ${extension.name},${extension.message}"
            }
        }


    }
}

