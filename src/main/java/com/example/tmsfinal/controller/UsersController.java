package com.example.tmsfinal.controller;

import com.example.tmsfinal.dao.OrdersDao;
import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.model.Order;
import com.example.tmsfinal.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @Autowired
    OrdersDao ordersDao;

    @Autowired
    UsersDao usersDao;

    @Autowired
    UserOrderService userOrderService;

    @GetMapping("/user/getInsert")
    public String insertOrder(){
        return "insertOrder";
    }

    @GetMapping("/user/findAllOrders")
    public ModelAndView findAllOrders(){
        return new ModelAndView("findAllOrders","orderList",userOrderService.findAllTableOrders());
    }

    @PostMapping("/user/insertOrder")
    public ModelAndView insertIntoOrder(Order order){
        return new ModelAndView("findAllOrders", "orderList",
                userOrderService.insertRecordToTableOrders(order));
    }

    @GetMapping("/user/updateOrder")
    public String updateGetOrder(){
        return "updateOrder";
    }


    @PostMapping("/user/updateOrder")
    public ModelAndView updateOrder(Order order){
        return new ModelAndView("findAllOrders", "orderList",
                userOrderService.updateRecordTableOrders(order));
    }

    @GetMapping("/user/deleteOrder")
    public String deleteGetOrder(){
        return "deleteOrder";
    }

    @PostMapping("/user/deleteOrder")
    public ModelAndView deleteOrder(Integer orderId){
        return new ModelAndView("findAllOrders", "orderList",
                userOrderService.deleteRecordTableOrdersById(orderId));
    }
}
