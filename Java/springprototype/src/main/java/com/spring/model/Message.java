package com.spring.model;

public class Message {
    private int id;
    private String message;

    public Message(){
        System.out.println("Prototype Bean Initialized .....");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return "Message [ id = "+id+ " Message = " +message+"]";
    }
}
