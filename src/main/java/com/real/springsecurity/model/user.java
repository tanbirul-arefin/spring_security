package com.real.springsecurity.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "user_table")
public class user {

    @Id
   // @GeneratedValue
    private Integer id;
    private String username;
    private String password;
}
