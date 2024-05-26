package com.example.tmsfinal.service;


import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.model.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final UsersDao usersDao;

    public UserService(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Users user = usersDao.findUsersByLogin(login);
        if (user == null){
            throw new UsernameNotFoundException(login);
        }
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getLogin())
                .password(user.getPassword())
                .roles(user.getRoles().get(0).getRole())
                .build();

    }
}
