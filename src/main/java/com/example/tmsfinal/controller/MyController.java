package com.example.tmsfinal.controller;



import com.example.tmsfinal.service.LoginService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Tag(name = "APIControllers", description = "Controllers BIG Task")
public class MyController {


    @Autowired
    LoginService loginService;


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
