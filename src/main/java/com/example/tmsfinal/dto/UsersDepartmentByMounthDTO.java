package com.example.tmsfinal.dto;

import org.springframework.stereotype.Component;

@Component
public class UsersDepartmentByMounthDTO {

    private String depart;

    private Integer kol;

    public UsersDepartmentByMounthDTO(String depart, Integer kol) {
        this.depart = depart;
        this.kol = kol;
    }

    public UsersDepartmentByMounthDTO() {
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public Integer getKol() {
        return kol;
    }

    public void setKol(Integer kol) {
        this.kol = kol;
    }

    @Override
    public String toString() {
        return "UsersDepartmentByMounthDTO{" +
                "depart='" + depart + '\'' +
                ", kol=" + kol +
                '}';
    }
}
