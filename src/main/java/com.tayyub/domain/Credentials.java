package com.tayyub.domain;

import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by abinadil on 8/15/2015.
 */
public class Credentials {

    @Indexed
    private String username;
    private String password;


    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
