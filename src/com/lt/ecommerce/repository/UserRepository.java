package com.lt.ecommerce.repository;

import com.lt.ecommerce.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<Integer, User> userMap = new HashMap<Integer, User>();

    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    public User getUser(int userId) {
        return userMap.get(userId);
    }

    public User removeUser(int userId) {
        return userMap.remove(userId);
    }

    public Map<Integer, User> getAllUsers() {
        return userMap;
    }

    public void removeAllUsers() {
        userMap.clear();
    }

    public int getUsersSize() {
        return userMap.size();
    }

    public boolean containsUser(int userId) {
        return userMap.containsKey(userId);
    }

}
