package com.example.mockman.models;

public class User {
    private String apiKey;
    private String name;

    public User(String apiKey, String name) {
        this.apiKey = apiKey;
        this.name = name;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
