package com.example.JeuxOlympiques.users;

import com.example.JeuxOlympiques.event.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Users getUsersById(@PathVariable Integer id) {
        return usersService.getUsersById(id);
    }

    @PostMapping
    public Users createUsers(@RequestBody Users users) {
        return usersService.createUsers(users);
    }

}
