package com.example.app.Repository;

import com.example.app.Entity.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<entity, Long> {
}
