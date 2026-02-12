package com.kushagra.app.service;

import com.kushagra.app.dao.UserRapo;
import com.kushagra.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRapo rapo;

    public User saveUser(User user){
        return rapo.save(user);
    }

}
