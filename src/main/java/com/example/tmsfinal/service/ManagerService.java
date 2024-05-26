package com.example.tmsfinal.service;


import com.example.tmsfinal.dao.OrderManagerDao;
import com.example.tmsfinal.dao.OrdersDao;
import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.dto.ConvertEntityDTO;
import com.example.tmsfinal.dto.UserManagerDepartmentDTO;
import com.example.tmsfinal.dto.UserManagerInfoDTO;
import com.example.tmsfinal.model.EmailContext;
import com.example.tmsfinal.model.Order;
import com.example.tmsfinal.model.Users;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Service
public class ManagerService {

    @Autowired
    UsersDao usersDao;

    @Autowired
    OrdersDao ordersDao;

    @Autowired
    DefaultEmailService defaultEmailService;

    @Autowired
    EmailContext emailContext;

    @Autowired
    OrderManagerDao orderManagerDao;

    public List<Order> findAllOrders() {
        return ordersDao.findAll();
    }

    public List<Order> updateOrderStatus( String status, Integer id) throws MessagingException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.format(formatter);
        Date date = java.sql.Timestamp.valueOf(dateTime);
        String statusEmail = "";
        if (status.equals("Accepted")) {
            statusEmail = "Ваша заявка принята";
            orderManagerDao.updateOrderStatusAccept(status,date,id);

        }else {
            statusEmail = "Ваша заявка выполнена";
            orderManagerDao.updateOrderStatusClose(status,date,id);
        }
        Order order = orderManagerDao.findAllById(id);
        Integer userId = orderManagerDao.findAUsersIdForEmailSend(id);
        Users users = usersDao.findAllById(userId);
        emailContext.setFrom("manageravtopodbor@gmail.com");
        emailContext.setTo(users.getEmail().toString());
        emailContext.setSubject("Заявка на подбор автомобиля");
        emailContext.setTemplateLocation("letter.html");
        emailContext.setContext(Map.of("firstName", users.getName(),
                "id", id.toString(),
                "brand", order.getBrand(),
                "model", order.getModel(),
                "releaseDate", " от " + order.getReleaseDateFrom().toString() + " до " + order.getReleaseDateTo(),
                "engineCapacity", " от " + order.getEngineCapacityFrom().toString() + " до " + order.getEngineCapacityTo(),
                "transmission", order.getTransmission(),
                "carBody", order.getCarBody(),
                "price", " от " + order.getPriceFrom().toString() + " до " + order.getPriceTo().toString(),
                "status", statusEmail));

        defaultEmailService.sendMail(emailContext);
        return ordersDao.findAll();
    }

//
//    public List<UserManagerDepartmentDTO> getManagerService() {
//        String nameuser = SecurityContextHolder.getContext().getAuthentication().getName();
//        List<Users> usersSpringSecurities = usersDao.getUsersManagerDepartment(nameuser, 5);
//
//        List<UserManagerDepartmentDTO> userManagerDepartmentDTOS = new ArrayList<>();
//        ConvertEntityDTO convertEntityDTO = new ConvertEntityDTO();
//        for (Users users : usersSpringSecurities) {
//            userManagerDepartmentDTOS.add(convertEntityDTO.mapToUserManagerDepartmentDTO(users));
//        }
//
//        System.out.println(usersSpringSecurities.toString());
//        return userManagerDepartmentDTOS;
//    }
//
//    public List<UserManagerInfoDTO> getUsersInfoService() {
//        String nameuser = SecurityContextHolder.getContext().getAuthentication().getName();
//        List<Users> usersSpringSecurities = usersDao.getUserManagerInfo(nameuser,5);
//
//        List<UserManagerInfoDTO> userManagerInfoDTOS = new ArrayList<>();
//        ConvertEntityDTO convertEntityDTO = new ConvertEntityDTO();
//        for (Users users : usersSpringSecurities) {
//            userManagerInfoDTOS.add(convertEntityDTO.mapToUserManagerInfoDTO(users));
//        }
//
//        System.out.println(usersSpringSecurities.toString());
//        return userManagerInfoDTOS;
//    }


}

