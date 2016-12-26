package com.velrino.alugalogo.Models;

public class ServerResponse {

    //200
    private String _id;
    private String email;
    private String name;
    private String creator;
    private String company;
    //400
    private String message;
    private String errors;
    private User user;

    public String getMessage() {
        return message;
    }
    public String getId() {
        return _id;
    }
    public String getEmail() {
        return email;
    }
    public String getCreator() {
        return creator;
    }
    public String getCompany() {
        return _id;
    }
    public String getName() {
        return name;
    }

    public String getErrors() { return errors; }

    public User getUser() {
        return user;
    }

}
