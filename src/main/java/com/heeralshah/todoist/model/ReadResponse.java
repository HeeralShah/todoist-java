package com.heeralshah.todoist.model;

import java.util.List;

import com.squareup.moshi.Json;

public class ReadResponse{

    public final List<Filter> filters; 
    @Json(name = "full_sync") public final boolean fullSync;
    public final List<Task> items;
    public final List<Label> labels; 
    public final List<Project> projects;
    public final List<Section> sections;
    public final Stats stats;
    @Json(name = "sync_token") public final String syncToken;
    
    //live_notifications
    // commented out to be implemented
    //@Json(name = "completed_info") public final List<String> completedInfo;
    //public final List<String> collaborators;
   // @Json(name = "day_orders") public final List<Integer> dayOrders;
    //live_notifications_last_read_id
    //locations
    //notes
    //project_notes
    //reminders
    //settings_notifications
    //temp id mapping
    //user
    //user_plan_limits
    //
    public ReadResponse(List<Filter> filters, boolean fullSync, List<Task> items, List<Label> labels, List<Project> projects, List<Section> sections, Stats stats, String syncToken){
        this.filters = filters;
        this.fullSync = fullSync;
        this.items = items;
        this.labels = labels;
        this.projects = projects;
        this.stats = stats;
        this.sections = sections;
        this.syncToken = syncToken;
        
    }
}
