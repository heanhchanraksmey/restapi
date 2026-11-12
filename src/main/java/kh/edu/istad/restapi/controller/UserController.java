package kh.edu.istad.restapi.controller;
import kh.edu.istad.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import kh.edu.istad.restapi.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
private final UserService userService;

@GetMapping
public List<User> getAll(){
    return userService.getAll();
}
@GetMapping("/{id}")
    public User getById(@PathVariable UUID id) {
    return userService.getById(id);
}

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public User create(@RequestBody User user) {
    return userService.createUser(user);
}
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User deleteById(@PathVariable UUID id) {
       return userService.deleteById(id);

    }

}
