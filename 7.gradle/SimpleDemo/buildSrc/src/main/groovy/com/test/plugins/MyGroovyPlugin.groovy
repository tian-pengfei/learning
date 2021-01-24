package com.test.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

public class MyGroovyPlugin implements Plugin<Project> {


    @Override
    public void apply(Project project) {

        ReleaseInfoExtension release= project.getExtensions().create("releaseInfo",
                ReleaseInfoExtension.class,project);

        for (int i=1;i<=10;i++){
            Task task=project.task("task"+i );

            task.doLast((a)->{
                System.out.println(a.getName());
            });
        }


    }
}

class ReleaseInfoExtension {

    String versionName;
    String versionCode;
    String versionInfo;
    String fileName;
    public ReleaseInfoExtension(String versionName, String versionCode, String fileName,  String versionInfo) {
        this.versionName = versionName;
        this.versionCode=versionCode;
        this.versionInfo=versionInfo;
        this.fileName=fileName;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
