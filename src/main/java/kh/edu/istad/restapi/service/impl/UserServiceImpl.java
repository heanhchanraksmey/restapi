package kh.edu.istad.restapi.service.impl;

import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import kh.edu.istad.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<User> getAll(){
        return userRepository.selectAll();
    }
    @Override
    public User getById(UUID id){
        return userRepository.selectById(id).orElseThrow();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User createById(User user) {
        return userRepository.save(user);
    }


    @Override
    public User deleteById(UUID id) {
       return userRepository.deleteById(id);

    }


}

