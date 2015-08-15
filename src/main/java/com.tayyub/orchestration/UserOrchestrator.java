package com.tayyub.orchestration;

import com.tayyub.domain.User;
import com.tayyub.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by abinadil on 8/10/2015.
 */

@Component
public class UserOrchestrator {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user){

        return userRepository.save(user);

    }





}
