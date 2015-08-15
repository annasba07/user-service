package com.tayyub.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by abinadil on 8/10/2015.
 */
public class User {

    @Id
    private String id;

    private Role role;
    private Person person;

    public String getId() {
        return id;
    }

    public Role getRole(){
        return role;
    }

    public Person getPerson(){
        return person;
    }







}
