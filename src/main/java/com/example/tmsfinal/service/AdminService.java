package com.example.tmsfinal.service;

import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.dto.AdminDTO;
import com.example.tmsfinal.dto.ConvertEntityDTO;
import com.example.tmsfinal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AdminService {

    @Autowired
    ConvertEntityDTO convertEntityDTO;

        @Autowired
    UsersDao usersDao;
    public List<AdminDTO> findAllUsersForAdmin() {
        List<Users> usersList = usersDao.findAllByOrderById();
        List<AdminDTO> adminDTOS = new ArrayList<>();
        for (Users users : usersList){
            adminDTOS.add(convertEntityDTO.usersRolesMapAdminChangeRoleDTO(users));
        }return adminDTOS;
    }


    public List<AdminDTO> updateUsersRole (Integer id, Integer role) {
        usersDao.updateUserRole(id, role);
        List<Users> usersList = usersDao.findAllByOrderById();
        List<AdminDTO> adminDTOS = new ArrayList<>();
        for (Users users : usersList){
            adminDTOS.add(convertEntityDTO.usersRolesMapAdminChangeRoleDTO(users));
        }return adminDTOS;
    }

    public List<AdminDTO> updateUsersStatus (Integer id, String status) {
        usersDao.updateUserStatus(id, status);
        List<Users> usersList = usersDao.findAllByOrderById();
        List<AdminDTO> adminDTOS = new ArrayList<>();
        for (Users users : usersList){
            adminDTOS.add(convertEntityDTO.usersRolesMapAdminChangeRoleDTO(users));
        }return adminDTOS;
    }
}
