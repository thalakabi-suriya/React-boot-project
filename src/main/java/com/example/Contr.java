package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Contr {

    @Autowired
    UserRepo repo;

    @GetMapping("/users/{email}/{password}")
    public List<User> getbyemailandpassword(@PathVariable String email,@PathVariable String password)
    {
        return repo.getbyemailandpassword(email,password);
    }

    @PostMapping("/users")
    public String saveusers(@RequestBody User user)
    {
        repo.save(user);
        return "User saved";
    }


}
