package com.test.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

import javax.inject.Inject;
import java.util.Map;

public class MyPlugin implements Plugin<Project> {


    @Override
    public void apply(Project project) {
        for (int i=1;i<=10;i++){
            Task task=project.task("task"+i );

            task.doLast((a)->{
                System.out.println(a.getName());
            });
        }


    }
}

