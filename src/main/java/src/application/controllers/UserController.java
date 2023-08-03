package src.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import src.application.controllers.services_factories.UserServiceFactory;
import src.domain.dtos.UserDtos;
import src.domain.entities.User;
import src.domain.services.UserService;

import java.util.List;

@RestController("users")
public class UserController {
    private UserService userService;
    public UserController() {
        this.userService = UserServiceFactory.generateService();
    }
    @PostMapping()
    public User create(UserDtos.Create createUserDto){
        return  this.userService.create(createUserDto);
    }

    @GetMapping()
    public List<User> getAll(){
        return this.userService.getAll();
    }

}
