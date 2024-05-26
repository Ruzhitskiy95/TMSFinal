package com.example.tmsfinal.service;



import com.example.tmsfinal.dao.TaskDao;
import com.example.tmsfinal.dto.ConvertEntityDTO;
import com.example.tmsfinal.dto.TasksEngineerDTO;
import com.example.tmsfinal.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class EngineerService {

//    @Autowired
//    TaskDao taskDao;
//
//    public List<TasksEngineerDTO> tasksEngineerDTOService(){
//        String nameuser = SecurityContextHolder.getContext().getAuthentication().getName();
//        List<Order> taskSpringSecurities =taskDao.getTasks(nameuser,5);
//        List<TasksEngineerDTO> tasksEngineerDTOList = new ArrayList<>();
//
//        ConvertEntityDTO convertEntityDTO = new ConvertEntityDTO();
//
//        for (Order task : taskSpringSecurities) {
//            tasksEngineerDTOList.add(convertEntityDTO.mapToTaskEngineerDTO(task));
//        }
//        System.out.println(tasksEngineerDTOList.toString());
//        return tasksEngineerDTOList;
//    }
}