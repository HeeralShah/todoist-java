package com.heeralshah.todoist.model;

import com.squareup.moshi.Json;

public class Project {

    public final long id;
    public final String name;
    public final int order;
    public final String color;
    @Json(name = "parent_id") public final String parentId;
    @Json(name = "is_favorite") public final boolean isFavourite;
    @Json(name = "is_archived") public final boolean isArchived;

    public Project(int id, String name, int order, String color, String parentId, int commentCount, boolean isFavourite, boolean isArchived) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.color = color;
        this.parentId = parentId;
        this.isFavourite = isFavourite;
        this.isArchived = isArchived;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", color=" + color +
                ", parent_id=" + parentId +
                "is_favorite=" + isFavourite+
                "is_archived=" + isArchived +
                '}';
    }
}
