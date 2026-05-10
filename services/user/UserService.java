package com.fixbot;

public class UserService {
    private UserValidator validator = new UserValidator();

    public void register(User user) {
        validator.validate(user);
    }
}
