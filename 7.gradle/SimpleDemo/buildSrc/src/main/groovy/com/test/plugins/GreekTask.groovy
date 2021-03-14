package com.test.plugins

import org.gradle.api.DefaultTask


import org.gradle.api.tasks.TaskAction

 class GreekTask extends DefaultTask {

   String perName="佚名"

    @TaskAction
    doAction(){
        println "${this.perName}你好，我是一个action"
    }

}
