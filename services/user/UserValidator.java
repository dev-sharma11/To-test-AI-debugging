package com.fixbot;

public class UserValidator {
    public void validate(User user) {
        if (user.getUsername() == null) {
            throw new RuntimeException("Username is required");
        }
        // FIX: Add validation for Email field
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new RuntimeException("Email is required");
        }
        System.out.println("User validated: " + user.getUsername());
    }
}
class User { 
    public String getUsername() { return "test"; }
    public String getEmail() { return null; }
}
