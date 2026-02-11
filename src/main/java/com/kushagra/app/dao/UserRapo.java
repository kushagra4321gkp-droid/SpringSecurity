package com.kushagra.app.dao;

import com.kushagra.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRapo extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
