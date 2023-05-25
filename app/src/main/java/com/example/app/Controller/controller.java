package com.example.app.Controller;

import com.example.app.Entity.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.app.Service.service;

import java.util.List;
import java.util.Optional;

@RestController
public class controller {
    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello guys!";
    }

    @Autowired
    service userservice;
    @GetMapping("getuser")
    public List<entity> getUser() {
        return userservice.getUser();
    }

    @GetMapping("findbyid/{id}")
    public Optional<entity> FindById(@PathVariable("id") Long id){
        return userservice.FindById(id);
    }

    @PostMapping("adduser")
    public entity adduser (@RequestBody entity useradd) {
        return userservice.adduser(useradd);
    }

    @PutMapping ("updateuser")
    public entity updateuser (@RequestBody entity user){
        return userservice.updateuser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteuser(@PathVariable Long id){
        userservice.deleteuser(id);
    }
}
