package katagroup.pre_project.dao;

import katagroup.pre_project.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(int id);

    void deleteUser(int id);

}
