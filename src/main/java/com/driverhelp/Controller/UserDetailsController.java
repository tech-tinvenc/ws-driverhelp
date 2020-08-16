package com.driverhelp.Controller;

import com.driverhelp.Entity.UserDetails;
import com.driverhelp.Service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserDetailsController {
    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/user")
    public ResponseEntity<UserDetails> addProduct(@RequestBody UserDetails userDetails) {
        return new ResponseEntity<>(userDetailsService.addUser(userDetails), HttpStatus.CREATED);
    }

    @GetMapping("/getuser")
    public ResponseEntity<List<UserDetails>> findAllUsers() {

        List<UserDetails> userDetails=userDetailsService.getAllUsers();
        return new ResponseEntity<>(userDetails,HttpStatus.OK);
    }
}
