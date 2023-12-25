package com.heeralshah.todoist.model;

public class ProjectCommand extends AbstractCommand<ProjectArgs> {

public ProjectCommand(String type, ProjectArgs args){
        super(type, args);
        setUuid();
        setTempId();
    }
}
