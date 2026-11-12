package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAll();
    User getById(UUID id);
    User createUser(User user);

    User createById(User user);

    User deleteById(UUID id);


}
