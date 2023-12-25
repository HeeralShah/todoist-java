package com.heeralshah.todoist.model;

import com.squareup.moshi.Json;

public class ProjectArgs implements IArgs {

    public final String name;
    public final String color; 
    @Json(name = "parent_id") public final long parentId;
    @Json(name = "is_favorite") public final boolean isFavourite;
    @Json(name = "child_order") public final int childOrder;
    @Json(name = "view_style") public final String viewStyle;

    public ProjectArgs(String name, String color, boolean isFavourite, long parentId, int childOrder, String viewStyle) {
        this.name = name;
        this.color = color;
        this.parentId = parentId;
        this.isFavourite = isFavourite;
        this.childOrder = childOrder;
        this.viewStyle = viewStyle;
    }
}
