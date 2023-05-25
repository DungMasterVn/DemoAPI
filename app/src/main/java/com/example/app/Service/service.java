package com.example.app.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.app.Entity.entity;
import java.util.List;
import java.util.Optional;

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

    public Optional<entity> FindById(Long id){
        return userrepo.findById(id);
    }

    public entity adduser (entity useradd) {
        return userrepo.save(useradd);
    }
    public entity updateuser (entity user){
        return userrepo.save(user);
    }

    public void deleteuser (Long id){
        userrepo.deleteById(id);
    }

}
