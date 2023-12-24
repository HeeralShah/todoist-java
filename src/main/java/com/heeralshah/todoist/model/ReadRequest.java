package com.heeralshah.todoist.model;

import java.util.List;

import com.squareup.moshi.Json;

public class ReadRequest{

    @Json(name = "sync_token") public String syncToken;
    @Json(name = "resource_types") public List<ResourceType> resourceTypes;


    public ReadRequest(String syncToken, List<ResourceType> resourceTypes){

        this.syncToken = syncToken;
        this.resourceTypes = resourceTypes;
    }


}