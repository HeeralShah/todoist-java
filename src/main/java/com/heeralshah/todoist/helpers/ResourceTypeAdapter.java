package com.heeralshah.todoist.helpers;

import com.heeralshah.todoist.model.ResourceType;
import com.squareup.moshi.ToJson;

public class ResourceTypeAdapter {
    @ToJson String toJson (ResourceType resourceType){
        return resourceType.getResourceType();
    }
    
}
