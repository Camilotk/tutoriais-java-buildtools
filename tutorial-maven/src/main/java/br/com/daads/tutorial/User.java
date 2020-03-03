package br.com.daads.tutorial;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class User {
    private Long id; 
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
 
    public User(String firstName, String lastName, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }
 }