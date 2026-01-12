package com.voiceflow.voiceflowbackend01.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bots")
public class Bot {

    @Id
    private String id;

    private String name;
    private String voice;
    private String model;

    // ✅ REQUIRED (THIS WAS MISSING)
    private String userId;

    // getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVoice() { return voice; }
    public void setVoice(String voice) { this.voice = voice; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
