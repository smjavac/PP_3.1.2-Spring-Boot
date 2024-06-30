package ru.saidmagomed.PP_312.Spring.Boot.service;



import ru.saidmagomed.PP_312.Spring.Boot.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    void removeUser(long id);

    User getUserById(long userid);

    void updateUser(long id, User user);
}
