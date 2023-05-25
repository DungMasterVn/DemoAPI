package com.example.app.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "useracc2")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class entity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
}
