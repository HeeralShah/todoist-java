package com.heeralshah.todoist.model;

public enum ResourceType {

    PROJECTS("projects"), 
    ITEMS("items"), 
    LABELS("labels"), 
    COMMENTS("comments"), 
    NOTES("notes"), 
    SECTIONS("sections"), 
    REMINDERS("reminders"), 
    ALL("all");

 
    private final String resourceType;

    private ResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceType() {
        return resourceType;
    }

}
