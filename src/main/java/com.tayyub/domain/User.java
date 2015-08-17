package com.tayyub.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by abinadil on 8/10/2015.
 */
public class User {

    @Id
    private String id;


    private Date createdDate = new Date();

    private Role role;
    private Person person;
    private Credentials credentials;


    public String getId() {
        return id;
    }

    public Role getRole(){
        return role;
    }

    public Person getPerson(){
        return person;
    }

    public Credentials getCredentials(){return credentials;}







}
