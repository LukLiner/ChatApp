package com.narimanvaliyev.chatapp.Model;

public class ChatMessage {

    private String content;

    public ChatMessage() {}

    public ChatMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
