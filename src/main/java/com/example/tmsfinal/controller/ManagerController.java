package com.example.tmsfinal.controller;

import com.example.tmsfinal.dao.OrderManagerDao;
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

    @Autowired
    OrderManagerDao orderManagerDao;

//    @GetMapping("/manager/findAllOrders")
//    public ModelAndView findAllOrders(){
//        return new ModelAndView("findAllOrdersForManager","orderList",managerService.findAllOrders());
//    }
    @GetMapping("/manager/viewAllOrdersStatus")
    public ModelAndView orderStatus(){
        return new ModelAndView("findAllOrdersForManager","orderList",managerService.findAllOrders());
    }

    @PostMapping("/manager/viewAllOrdersStatus")
    public ModelAndView updateOrderStatus(@RequestParam("id") final Integer id,
                                          @RequestParam("status") final String status) throws MessagingException {
        return new ModelAndView("findAllOrdersForManager", "orderList",
                managerService.updateOrderStatus(status, id, "viewAllOrders"));
    }

    @GetMapping("/manager/viewInProcessingOrders")
    public ModelAndView processingOrdersStatus() {
        return new ModelAndView("findAllInProcessingForManager", "orderList",
                orderManagerDao.findAllByStatusManager("In processing"));
    }
    @PostMapping("/manager/viewInProcessingOrders")
    public ModelAndView updateProcessingOrderStatus(@RequestParam("id") final Integer id,
                                          @RequestParam("status") final String status) throws MessagingException {
        return new ModelAndView("findAllInProcessingForManager", "orderList",
                managerService.updateOrderStatus(status, id, "viewInProcessingOrders"));
    }
    @PostMapping("/manager/viewAcceptedOrders")
    public ModelAndView updateAcceptedOrderStatus(@RequestParam("id") final Integer id,
                                          @RequestParam("status") final String status) throws MessagingException {
        return new ModelAndView("findAllAcceptedForManager", "orderList",
                managerService.updateOrderStatus(status, id, "viewAcceptedOrders"));
    }

    @GetMapping("/manager/viewAcceptedOrders")
    public ModelAndView acceptedOrderStatus() {
        return new ModelAndView("findAllAcceptedForManager", "orderList",
                orderManagerDao.findAllByStatusManager("Accepted"));
    }

    @PostMapping("/manager/viewClosedOrders")
    public ModelAndView updateViewClosedOrdersStatus(@RequestParam("id") final Integer id,
                                          @RequestParam("status") final String status) throws MessagingException {
        return new ModelAndView("findAllProcessedForManager", "orderList",
                managerService.updateOrderStatus(status, id, "viewClosedOrders"));
    }
    @GetMapping("/manager/viewClosedOrders")
    public ModelAndView viewClosedOrdersStatus() {
        return new ModelAndView("findAllProcessedForManager", "orderList",
                orderManagerDao.findAllByStatusManager("Processed"));
    }

}
