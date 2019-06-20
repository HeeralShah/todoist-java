package com.aaroncoplan.todoist;

import com.aaroncoplan.todoist.helpers.LabelRequest;
import com.aaroncoplan.todoist.helpers.ProjectRequest;
import com.aaroncoplan.todoist.helpers.TaskRequest;
import com.aaroncoplan.todoist.model.Label;
import com.aaroncoplan.todoist.model.Project;
import com.aaroncoplan.todoist.model.Task;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonAdapters {

    private static final Moshi moshi = new Moshi.Builder().build();

    private static final JsonAdapter<Project[]> projectArrayJsonAdapter = moshi.adapter(Project[].class);
    private static final JsonAdapter<Project> projectJsonAdapter = moshi.adapter(Project.class);
    private static final JsonAdapter<ProjectRequest> projectRequestJsonAdapter = moshi.adapter(ProjectRequest.class);

    private static final JsonAdapter<Task[]> taskArrayJsonAdapter = moshi.adapter(Task[].class);
    private static final JsonAdapter<Task> taskJsonAdapter = moshi.adapter(Task.class);
    private static final JsonAdapter<TaskRequest> taskRequestJsonAdapter = moshi.adapter(TaskRequest.class);

    private static final JsonAdapter<Label[]> labelArrayJsonAdaper = moshi.adapter(Label[].class);
    private static final JsonAdapter<Label> labelJsonAdapter = moshi.adapter(Label.class);
    private static final JsonAdapter<LabelRequest> labelRequestJsonAdapter = moshi.adapter(LabelRequest.class);

    public static List<Project> extractProjectList(String json) throws IOException {
        return Arrays.asList(projectArrayJsonAdapter.fromJson(json));
    }

    public static Project extractProject(String json) throws IOException {
        return projectJsonAdapter.fromJson(json);
    }

    public static String writeProjectRequest(ProjectRequest projectRequest) {
        return projectRequestJsonAdapter.toJson(projectRequest);
    }

    public static List<Task> extractTaskList(String json) throws IOException {
        return Arrays.asList(taskArrayJsonAdapter.fromJson(json));
    }

    public static Task extractTask(String json) throws IOException {
        return taskJsonAdapter.fromJson(json);
    }

    public static String writeTaskRequest(TaskRequest taskRequest) {
        return taskRequestJsonAdapter.toJson(taskRequest);
    }

    public static List<Label> extractLabelList(String json) throws IOException {
        return Arrays.asList(labelArrayJsonAdaper.fromJson(json));
    }

    public static Label extractLabel(String json) throws IOException {
        return labelJsonAdapter.fromJson(json);
    }

    public static String writeLabelRequest(LabelRequest labelRequest) {
        return labelRequestJsonAdapter.toJson(labelRequest);
    }
}
