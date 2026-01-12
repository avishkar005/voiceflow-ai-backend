package com.voiceflow.voiceflowbackend01.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "conversations")
public class Conversation {

    @Id
    private String id;

    private String botId;
    private String userId;
    private List<Message> messages;

    // getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBotId() { return botId; }
    public void setBotId(String botId) { this.botId = botId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public List<Message> getMessages() { return messages; }
    public void setMessages(List<Message> messages) { this.messages = messages; }
}
