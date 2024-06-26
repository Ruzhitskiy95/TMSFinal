package com.example.tmsfinal.service;


import com.example.tmsfinal.config.JwtService;
import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UsersDao usersDao;



    public String loginTokenService(String username, String password){
        String nameuser = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(nameuser);
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        if (authentication.isAuthenticated()){
            String token = jwtService.createToken(username);
            System.out.println(token);
            return token;

        }else {
            throw new UsernameNotFoundException("Invalid user request");
        }
    }

    public ResponseEntity<String> loginService (){
        String login = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(login);
        Users user = usersDao.findUsersByLogin(login);
        String password = user.getPassword();
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login,password));
        if (authentication.isAuthenticated()){
            String token = jwtService.createToken(login);
            System.out.println(token);
            return ResponseEntity.ok(token);

        }else {
            throw new UsernameNotFoundException("Invalid user request");
        }
    }

}
