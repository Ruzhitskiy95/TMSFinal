package com.example.tmsfinal.service;

import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    UsersDao usersDao;


    public void registrationUser(String emailUser, String userLogin, String userName, String userPassword) {

        Users users = new Users();

        users.setEmail(emailUser);
        users.setLogin(userLogin);
        users.setName(userName);
        String password = new BCryptPasswordEncoder().encode(userPassword);
        users.setPassword(password);
        users.setStatus("Active");
        usersDao.save(users);
        Integer maxId = usersDao.getMaxUserId();
        usersDao.insertRole(maxId);
    }
}
