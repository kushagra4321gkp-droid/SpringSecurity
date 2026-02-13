package com.kushagra.app.service;

import com.kushagra.app.dao.UserRapo;
import com.kushagra.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRapo rapo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPasswordd(encoder.encode(user.getPasswordd()));
        System.out.println(user.getPasswordd());
        return rapo.save(user);
    }

}
