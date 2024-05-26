package com.example.tmsfinal.dto;

import org.springframework.stereotype.Component;

@Component
public class UserManagerDepartmentDTO {

    private String username;

    private String department;

    private Integer kol;

    public UserManagerDepartmentDTO() {
    }

    public UserManagerDepartmentDTO(String username, String department, Integer kol) {
        this.username = username;
        this.department = department;
        this.kol = kol;
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

    public Integer getKol() {
        return kol;
    }

    public void setKol(Integer kol) {
        this.kol = kol;
    }

    @Override
    public String toString() {
        return "UserManagerDepartmentDTO{" +
                "username='" + username + '\'' +
                ", department='" + department + '\'' +
                ", kol=" + kol +
                '}';
    }
}
