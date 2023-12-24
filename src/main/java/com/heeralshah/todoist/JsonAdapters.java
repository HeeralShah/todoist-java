package com.heeralshah.todoist;

import com.heeralshah.todoist.helpers.*;
//import com.heeralshah.todoist.model.Comment;
//import com.heeralshah.todoist.model.Label;
//import com.heeralshah.todoist.model.Project;
//import com.heeralshah.todoist.model.Task;
import com.heeralshah.todoist.model.ResourceType;
import com.heeralshah.todoist.model.ReadRequest;
import com.heeralshah.todoist.model.ReadResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;
//import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class JsonAdapters {

    private static final Moshi moshi = new Moshi.Builder()
                                                .add(new ResourceTypeAdapter())
                                                .build();

    private static final JsonAdapter<ReadRequest> projectReadRequestAdapter = moshi.adapter(ReadRequest.class);

    private static final JsonAdapter<ReadResponse> projectReadResponseAdapter = moshi.adapter(ReadResponse.class);

    public static String writeReadRRequest(ReadRequest readRequest) {
        return projectReadRequestAdapter.toJson(readRequest);
    }

    public static ReadResponse extractReadResponse(String json) throws IOException{
        return projectReadResponseAdapter.fromJson(json);
    }
/**

    private static final JsonAdapter<Project[]> projectArrayJsonAdapter = moshi.adapter(Project[].class);
    private static final JsonAdapter<Project> projectJsonAdapter = moshi.adapter(Project.class);
    private static final JsonAdapter<ProjectRequest> projectRequestJsonAdapter = moshi.adapter(ProjectRequest.class);

    private static final JsonAdapter<Task[]> taskArrayJsonAdapter = moshi.adapter(Task[].class);
    private static final JsonAdapter<Task> taskJsonAdapter = moshi.adapter(Task.class);
    private static final JsonAdapter<TaskRequest> taskRequestJsonAdapter = moshi.adapter(TaskRequest.class);

    private static final JsonAdapter<Label[]> labelArrayJsonAdaper = moshi.adapter(Label[].class);
    private static final JsonAdapter<Label> labelJsonAdapter = moshi.adapter(Label.class);
    private static final JsonAdapter<LabelRequest> labelRequestJsonAdapter = moshi.adapter(LabelRequest.class);

    private static final JsonAdapter<Comment[]> commentArrayJsonAdapter = moshi.adapter(Comment[].class);
    private static final JsonAdapter<Comment> commentJsonAdapter = moshi.adapter(Comment.class);
    private static final JsonAdapter<CommentRequest> commentRequestJsonAdapter = moshi.adapter(CommentRequest.class);

    private static final JsonAdapter<ActivityResponse> activityResponseJsonAdapter = moshi.adapter(ActivityResponse.class);
    private static final JsonAdapter<ActivityRequest> activityRequestJsonAdapter = moshi.adapter(ActivityRequest.class);



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

    public static List<Comment> extractCommentList(String json) throws IOException {
        return Arrays.asList(commentArrayJsonAdapter.fromJson(json));
    }

    public static Comment extractComment(String json) throws IOException {
        return commentJsonAdapter.fromJson(json);
    }

    public static String writeCommentRequest(CommentRequest commentRequest) {
        return commentRequestJsonAdapter.toJson(commentRequest);
    }

    public static ActivityResponse extractActivityResponse(String json) throws IOException {
        return activityResponseJsonAdapter.fromJson(json);
    }

    public static String writeActivityRequest(ActivityRequest activityRequest) {
        return activityRequestJsonAdapter.toJson(activityRequest);
    }
 */

    public static void main(String args[]) {


        //this is an array not a list ->convert to list
        ResourceType[] resourceTypes = new ResourceType[]{ResourceType.PROJECTS};
        List<ResourceType> finalResourceTypes = Arrays.asList(resourceTypes);
        String token = "placeholder";
        ReadRequest newReadRequest = new ReadRequest(token, finalResourceTypes);
        System.out.println(JsonAdapters.writeReadRRequest(newReadRequest));

    }

}

