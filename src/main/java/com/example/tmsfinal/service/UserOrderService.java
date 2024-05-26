package com.example.tmsfinal.service;

import com.example.tmsfinal.dao.OrdersDao;
import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.model.Order;
import com.example.tmsfinal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class UserOrderService {

    @Autowired
    OrdersDao ordersDao;

    @Autowired
    UsersDao usersDao;

    public List<Order> insertRecordToTableOrders(Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.format(formatter);
        Date date = java.sql.Timestamp.valueOf(dateTime);
        order.setCreatedData(date);
        Users users = usersDao.findUsersByLogin(SecurityContextHolder.getContext().getAuthentication().getName());
        Integer userId = users.getId();
        order.setStatus("In processing");
        ordersDao.save(order);
        Integer newMaxId = ordersDao.getMaxId();
        ordersDao.updateUserId(userId, newMaxId);
        return ordersDao.findAllByUsersId(userId);
    }

    public List<Order> updateRecordTableOrders(Order order) {
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        Integer userId = usersDao.getUserRoleId(userName);
            ordersDao.updateById(order.getBrand(),
                    order.getModel(),
                    order.getReleaseDateFrom(),
                    order.getReleaseDateTo(),
                    order.getEngineCapacityFrom(),
                    order.getEngineCapacityTo(),
                    order.getTransmission(),
                    order.getCarBody(),
                    order.getPriceFrom(),
                    order.getPriceTo(),
                    order.getId());
        return ordersDao.findAllByUsersId(userId);
    }

    public List<Order> deleteRecordTableOrdersById(Integer id) {
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        Integer userId = usersDao.getUserRoleId(userName);
        Integer checkAccess = ordersDao.findAUsersIdForDeleteOrder(id);
        if (userId.equals(checkAccess)){
            ordersDao.deleteOrdersByUserId(id);
        }
        return ordersDao.findAllByUsersId(userId);
    }

    public List<Order> findAllTableOrders() {
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        Integer userId = usersDao.getUserRoleId(userName);
        return ordersDao.findAllByUsersId(userId);
    }
}
