package com.tayyub.respository;

import java.util.List;

import com.tayyub.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by abinadil on 8/15/2015.
 */

public interface UserRepository extends MongoRepository<User,String>{


        public User findByCredentials_Username(String username);


}
