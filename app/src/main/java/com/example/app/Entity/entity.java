package com.example.app.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "useracc1")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class entity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
}
