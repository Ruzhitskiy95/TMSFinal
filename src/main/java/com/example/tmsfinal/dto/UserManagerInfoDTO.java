package com.example.tmsfinal.dto;


import com.example.tmsfinal.model.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserManagerInfoDTO {


    private String username;

    private String department;

    private List<Order> taskSpringSecurities;


    public UserManagerInfoDTO() {
    }

    public UserManagerInfoDTO(String username, String department, List<Order> taskSpringSecurities) {
        this.username = username;
        this.department = department;
        this.taskSpringSecurities = taskSpringSecurities;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Order> getTaskSSES() {
        return taskSpringSecurities;
    }

    public void setTaskSSES(List<Order> taskSpringSecurities) {
        this.taskSpringSecurities = taskSpringSecurities;
    }

    @Override
    public String toString() {
        return "UserManagerInfoDTO{" +
                "username='" + username + '\'' +
                ", department='" + department + '\'' +
                ", taskSSES=" + taskSpringSecurities +
                '}';
    }
}
