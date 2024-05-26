package com.example.tmsfinal.controller;


import com.example.tmsfinal.dao.UsersDao;
import com.example.tmsfinal.dto.*;
import com.example.tmsfinal.service.AdminService;
import com.example.tmsfinal.service.EngineerService;
import com.example.tmsfinal.service.LoginService;
import com.example.tmsfinal.service.ManagerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "APIControllers", description = "Controllers BIG Task")
public class MyController {

//    @Autowired
//    UsersDao usersDao;
//
//    @Autowired
//    AdminService adminService;
//
//    @Autowired
//    EngineerService engineerService;
//
//    @Autowired
//    ManagerService managerService;
//
    @Autowired
    LoginService loginService;
//
//
//
//    @GetMapping("/engineer")
//    public ResponseEntity<List<TasksEngineerDTO>> getEngineer(){
//        return  ResponseEntity.ok(engineerService.tasksEngineerDTOService());
//    }
//
//    @GetMapping("/admin/getManagersCount")
//    public ResponseEntity<Integer> getManagersCount(){
//        return  ResponseEntity.ok(adminService.getManagersCountService());
//    }
//
//    @GetMapping("/admin/getUsersDepartmentByMounth")
//    public ResponseEntity<List<UsersDepartmentByMounthDTO>> getUsersDepartmentByMounth(){
//        return  ResponseEntity.ok(adminService.getUsersDepartmentByMounth());
//    }
//
//    @GetMapping("/admin/getManagerInfoAndDepartment")
//    public ResponseEntity<List<InfoAndDepartmentDTO>> getManagerInfoAndDepartment(){
//        return  ResponseEntity.ok(adminService.getManagerInfoAndDepartment());
//    }
//
//    @GetMapping("/admin/getUserInfoAndTasksByName")
//    public ResponseEntity<List<InfoAndDepartmentDTO>> getUserInfoAndTasksByName(){
//        return  ResponseEntity.ok(adminService.getUserInfoAndTasksByName());
//    }
//
//    @GetMapping("/manager/getUsersDepartment")
//    public ResponseEntity<List<UserManagerDepartmentDTO>> getManager(){
//        return  ResponseEntity.ok(managerService.getManagerService());
//    }
//
//    @GetMapping("/manager/getUsersInfo")
//    public ResponseEntity<List<UserManagerInfoDTO>> getManagerInfo(){
//        return  ResponseEntity.ok(managerService.getUsersInfoService());
//    }
//
//    @PostMapping("/loginToken")
//    public ResponseEntity<String> login(@RequestParam("username") final String username,
//                                        @RequestParam("password") final String password){
//        return ResponseEntity.ok(loginService.loginTokenService(username,password));
//    }
//
    @GetMapping("/login")
    public ResponseEntity<ResponseEntity<String>> login(){
        return ResponseEntity.ok(loginService.loginService());
    }

}
