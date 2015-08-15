package com.tayyub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by abinadil on 8/10/2015.
 */

@SpringBootApplication
public class Application {


    public static void main(String[] args){

        ApplicationContext hello = SpringApplication.run(Application.class, args);

    }


}
