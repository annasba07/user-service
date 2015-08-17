package com.tayyub;

import com.tayyub.domain.Credentials;
import com.tayyub.domain.Person;
import com.tayyub.domain.Role;
import com.tayyub.domain.User;
import com.tayyub.orchestration.UserOrchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by abinadil on 8/10/2015.
 */

@RestController
public class UserController {

    @Autowired
    UserOrchestrator userOrchestrator;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User user(@RequestBody User user){

        return userOrchestrator.createUser(user);

    }


    @RequestMapping(value = "/usercheck", method = RequestMethod.POST)
    public User usercheck(@RequestBody Credentials credentials){

        return userOrchestrator.checkUser(credentials.getUsername());
    }




}
