package com.github.kelvinjardin.arrayify.services

import com.github.kelvinjardin.arrayify.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
