package com.example.tmsfinal.service;

import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.dto.ConvertEntityDTO;
import com.example.tmsfinal.dto.InfoAndDepartmentDTO;
import com.example.tmsfinal.dto.UsersDepartmentByMounthDTO;
import com.example.tmsfinal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

//    @Autowired
//    UsersDao usersDao;
//
//    public Integer getManagersCountService(){
//        return usersDao.getManagerCount();
//    }
//
//    public List<UsersDepartmentByMounthDTO> getUsersDepartmentByMounth(){
//        List<Users> usersSpringSecurities = usersDao.getUsersDepartmentByMounth(5);
//        List<UsersDepartmentByMounthDTO> usersDepartmentByMounthDTOS = new ArrayList<>();
//        ConvertEntityDTO convertEntityDTO = new ConvertEntityDTO();
//        for (Users users : usersSpringSecurities) {
//            usersDepartmentByMounthDTOS.add(convertEntityDTO.mapToTaskDepartmentByMounth(users));
//        }
//        return usersDepartmentByMounthDTOS;
//    }
//    public List<InfoAndDepartmentDTO> getManagerInfoAndDepartment(){
//        List<Users> usersSpringSecurities = usersDao.getManagerInfoAndDepartment("Tom");
//        List<InfoAndDepartmentDTO> infoAndDepartmentDTOS = new ArrayList<>();
//        ConvertEntityDTO convertEntityDTO = new ConvertEntityDTO();
//        for (Users users : usersSpringSecurities) {
//            infoAndDepartmentDTOS.add(convertEntityDTO.mapToManagerInfoAndDepartmentDTO(users));
//        }
//        return infoAndDepartmentDTOS;
//    }
//
//    public List<InfoAndDepartmentDTO> getUserInfoAndTasksByName() {
//        List<Users> usersSpringSecurities = usersDao.getUserInfoAndTasksByName("Rikki");
//        List<InfoAndDepartmentDTO> infoAndDepartmentDTOS = new ArrayList<>();
//        ConvertEntityDTO convertEntityDTO = new ConvertEntityDTO();
//        for (Users users : usersSpringSecurities) {
//            infoAndDepartmentDTOS.add(convertEntityDTO.mapToManagerInfoAndDepartmentDTO(users));
//        }return infoAndDepartmentDTOS;
//    }

}
