package com.github.lglxb.intellijtemplate.services

import com.intellij.openapi.project.Project
import com.github.lglxb.intellijtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
