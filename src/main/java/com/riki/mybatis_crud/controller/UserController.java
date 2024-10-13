package com.riki.mybatis_crud.controller;

import com.riki.mybatis_crud.model.User;
import com.riki.mybatis_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Mendapatkan semua pengguna
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Menambahkan pengguna baru
    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    // Memperbarui pengguna
    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        userService.updateUser(user);
    }

    // Menghapus pengguna
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public User showUserDetail(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
