package com.velrino.alugalogo.Models;

public class ServerRequest {

    private String operation;
    private User user;
    private String email;
    private String password;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRequest(User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
