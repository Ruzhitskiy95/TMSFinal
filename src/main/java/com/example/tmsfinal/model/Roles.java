package com.example.tmsfinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer rolesId;

    @Column(name = "role")
    private String role;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles", cascade = CascadeType.ALL)
    private List<Users> users;

    public Roles() {
    }

    public Roles(Integer rolesId, String role, List<Users> users) {
        this.rolesId = rolesId;
        this.role = role;
        this.users = users;
    }

    public Roles(Integer rolesId, String role) {
        this.rolesId = rolesId;
        this.role = role;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "rolesId=" + rolesId +
                ", role='" + role + '\'' +
                ", users=" + users +
                '}';
    }
}

