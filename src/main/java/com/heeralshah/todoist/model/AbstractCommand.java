package com.heeralshah.todoist.model;

import com.squareup.moshi.Json;

import java.util.UUID;

public abstract class AbstractCommand<T extends IArgs> {

    public final String type;
    @Json(name = "temp_id") public String tempId;
    public String uuid;
    public T args;

    public AbstractCommand(String type, T args){
        this.type = type;
        this.args = args;
        setUuid();
        setTempId();
    }

    protected void setUuid() {
        this.uuid = UUID.randomUUID().toString();
    }

    protected void setTempId() {
        this.tempId = UUID.randomUUID().toString();
    }


}
