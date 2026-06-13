package com.example.erp_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erp_management_system.entity.User;
import com.example.erp_management_system.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    // Create User
    // @PostMapping
    // public User createUser(@RequestBody User user) {
    //     return userService.saveUser(user);
    // }

    @PostMapping
public User createUser(@RequestBody User user) {

    System.out.println("===== REGISTER REQUEST =====");
    System.out.println("Username: " + user.getUsername());
    System.out.println("Email: " + user.getEmail());

    return userService.saveUser(user);
}
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        User dbUser = userService.login(user.getEmail());
        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok(dbUser);
        }
        return ResponseEntity.badRequest().body("Invalid Credentials");
    }

    // Get All Users
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // Update User
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setUserId(id);
        return userService.saveUser(user);
    }

    @GetMapping("/count")
    public long getUserCount() {
        return userService.getUserCount();
    }

    // Delete User
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Deleted successfully";
    }
}
