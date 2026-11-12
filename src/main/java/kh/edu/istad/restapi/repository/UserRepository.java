package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public class UserRepository {
    private List<User> users;
    public UserRepository() {
        users = new ArrayList<>();
        User userAdmin = new User(UUID.randomUUID(),
                "Administrator", "admin",
                "qwer", true);
        User usrEditor = new User(UUID.randomUUID(),
                "Editor", "editor",
                "qwer", false);
        User usrCustomer = new User(UUID.randomUUID(),
                "Ki Lyna", "kilyna",
                "qwer", true);
        users.add(userAdmin);
        users.add(usrEditor);
        users.add(usrCustomer);
    }
    public List<User> selectAll() {
        return users;
    }
   public Optional<User> selectById(UUID id) {
        return users.stream().filter(user -> user
                .getId().equals(id)).findFirst();
   }
public void insert(User user) {
        users.add(user);
}


    public User deleteById(UUID id) {
        users.removeIf(user -> user.getId().equals(id));
        return null;
    }

    public User save(User user) {

      users.add(user);
      return user;
    }
}
