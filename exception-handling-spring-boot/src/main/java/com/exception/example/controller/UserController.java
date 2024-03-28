package com.exception.example.controller;


import com.exception.example.dto.User;
import com.exception.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private  UserService userService;


    @GetMapping("/{userName}")
    public ResponseEntity getUserByUserName(@PathVariable String userName){
      return  ResponseEntity.ok(userService.readUserByUserName(userName));
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){
        userService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/airline/{airlineId}")
    public ResponseEntity createUser(@PathVariable String airlineId){
        return ResponseEntity.ok(userService.readAirline(airlineId));
    }
}
