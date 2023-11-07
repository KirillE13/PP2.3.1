package katagroup.pre_project.service;

import katagroup.pre_project.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
