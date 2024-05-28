package com.example.tmsfinal.controller;

import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.service.AdminService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {


    @Autowired
    UsersDao usersDao;

    @Autowired
    AdminService adminService;


    @GetMapping("/admin/findAllUsers")
    public ModelAndView findAllUsers(){
        return new ModelAndView("findAllUsersForAdmin","usersList",adminService.findAllUsersForAdmin());
    }

    @PostMapping("/admin/viewChangeRoleUsers")
    public ModelAndView changeRoleUsers(@RequestParam("id") final Integer id,
                                          @RequestParam("role") final Integer role) throws MessagingException {
        return new ModelAndView("findAllUsersForAdmin", "usersList",
                adminService.updateUsersRole(id,role));
    }

    @PostMapping("/admin/viewChangeStatusUser")
    public ModelAndView changeStatusUsers(@RequestParam("id") final Integer id,
                                        @RequestParam("status") final String status) throws MessagingException {
        return new ModelAndView("ChangeStatusForAdmin", "usersList",
                adminService.updateUsersStatus(id,status));
    }

    @GetMapping("/admin/changeStatus")
    public ModelAndView findAllUsersAfterChangeStatus(){
        return new ModelAndView("ChangeStatusForAdmin","usersList",adminService.findAllUsersForAdmin());
    }

}
