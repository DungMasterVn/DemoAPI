package com.example.app.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.app.Entity.entity;
import java.util.List;
import com.example.app.Repository.repository;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class service {
    @Autowired
    repository userrepo;

    public List<entity> getUser(){
        return userrepo.findAll();
    }

    public entity saveuser (entity user){
        return userrepo.save(user);
    }

}
