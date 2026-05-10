package com.fixbot;

public class UserValidator {
    public void validate(User user) {
        if (user.getUsername() == null) {
            throw new RuntimeException("Username is required");
        }
        // BUG: Missing check for Email field
        System.out.println("User validated: " + user.getUsername());
    }
}
class User { 
    public String getUsername() { return "test"; }
    public String getEmail() { return null; }
}
