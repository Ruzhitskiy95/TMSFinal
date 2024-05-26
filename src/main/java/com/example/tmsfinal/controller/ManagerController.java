package com.example.tmsfinal.controller;

import com.example.tmsfinal.dao.OrdersDao;
import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.model.Order;
import com.example.tmsfinal.service.ManagerService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManagerController {

    @Autowired
    OrdersDao ordersDao;

    @Autowired
    UsersDao usersDao;

    @Autowired
    ManagerService managerService;

    @GetMapping("/manager/findAllOrders")
    public ModelAndView findAllOrders(){
        return new ModelAndView("findAllOrdersForManager","orderList",managerService.findAllOrders());
    }

    @PostMapping("/manager/updateOrderStatus")
    public ModelAndView updateOrderStatus(@RequestParam("id") final Integer id,
                                          @RequestParam("status") final String status) throws MessagingException {
        return new ModelAndView("findAllOrdersForManager", "orderList",
                managerService.updateOrderStatus(status, id));
    }

}
