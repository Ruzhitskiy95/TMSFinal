package com.example.tmsfinal.dto;


import com.example.tmsfinal.model.Users;
import org.springframework.stereotype.Component;

@Component
public class ConvertEntityDTO {

    public AdminDTO usersRolesMapAdminChangeRoleDTO (Users users){
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setId(users.getId());
        adminDTO.setEmail(users.getEmail());
        adminDTO.setLogin(users.getLogin());
        adminDTO.setName(users.getName());
        adminDTO.setStatus(users.getStatus());
        adminDTO.setRole(users.getRoles().get(0).getRole());
        return adminDTO;
    }

}
