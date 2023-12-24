package com.heeralshah.todoist.model;

public enum ResourceTypes {

    PROJECTS("projects"), 
    ITEMS("items"), 
    LABELS("labels"), 
    COMMENTS("comments"), 
    NOTES("notes"), 
    SECTIONS("sections"), 
    REMINDERS("reminders"), 
    ALL("all");

 
    private final String resourceType;

    private ResourceTypes(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceType() {
        return resourceType;
    }

    @Override
    public String toString() {
        return this.resourceType;
    }

}
