package com.example.tmsfinal.controller;

import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.service.RegistrationService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @Autowired
    UsersDao usersDao;
    @Autowired
    RegistrationService registrationService;

    @GetMapping("/registration")
    public ModelAndView registrationUser(){
        return new ModelAndView("registration");
    }

    @PostMapping("/registrationUser")
    public ModelAndView registrationUser(@RequestParam("userEmail") final String userEmail,
                                         @RequestParam("userLogin") final String userLogin,
                                         @RequestParam("userName") final String userName,
                                         @RequestParam("userPassword") final String userPassword) throws MessagingException {
        registrationService.registrationUser(userEmail,userLogin,userName,userPassword);
        return new ModelAndView("redirect:/user/getInsert");
    }
}
