package src.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import src.domain.dtos.UserDtos;
import src.domain.entities.User;
import src.domain.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody UserDtos.Create createUserDto){
        System.out.println(createUserDto.cep);
        return this.userService.create(createUserDto);
    }

    @GetMapping
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @GetMapping("/{cpf}")
    public User getByCpf(@PathVariable String cpf){
        return this.userService.getByCpf(cpf);
    }

    @DeleteMapping("/{cpf}")
    public void delete(@PathVariable String cpf){
        this.userService.delete(cpf);
    }

}
