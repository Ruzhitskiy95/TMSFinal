package com.example.tmsfinal.dto;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class UsersEngineDTO {


    private Integer usersId;

    private String username;

    private String password;

    private String name;

    private String department;

    private Date createdData;

    private String description;

    public UsersEngineDTO() {
    }

    public UsersEngineDTO(Integer usersId, String username, String password, String name, String department, Date createdData, String description) {
        this.usersId = usersId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.department = department;
        this.createdData = createdData;
        this.description = description;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getCreatedData() {
        return createdData;
    }

    public void setCreatedData(Date createdData) {
        this.createdData = createdData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UsersEngineDTO{" +
                "usersId=" + usersId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", createdData=" + createdData +
                ", description='" + description + '\'' +
                '}';
    }
}
