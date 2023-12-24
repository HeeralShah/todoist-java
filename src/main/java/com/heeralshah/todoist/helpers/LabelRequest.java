package com.heeralshah.todoist.helpers;

import com.heeralshah.todoist.TodoistException;

public class LabelRequest {

    public final String name;
    public final Integer order;

    public LabelRequest(String name, Integer order) throws TodoistException{
        
        this.name = name;
        this.order = order;
    }
}
