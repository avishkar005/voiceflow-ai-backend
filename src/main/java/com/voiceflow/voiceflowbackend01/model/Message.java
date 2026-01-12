package com.voiceflow.voiceflowbackend01.model;

public class Message {

    private String role; // user / assistant
    private String content;
    private String timestamp;

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
