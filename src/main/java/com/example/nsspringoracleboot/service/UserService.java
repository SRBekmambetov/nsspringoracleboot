package com.example.nsspringoracleboot.service;

import com.example.nsspringoracleboot.dao.UserDao;
import com.example.nsspringoracleboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return this.userDao.findAll();
    }

    public User addUser(User user) {
        return this.userDao.save(user);
    }

    //other methods go here


    public Optional<User> getUserById(int id) {
        return this.userDao.findById(id);
    }

    public User updateUser(User user) {
        return this.userDao.save(user);
    }

    public void deleteUserById(int id) {
        this.userDao.deleteById(id);
    }

    public void deleteAllUsers() {
        this.userDao.deleteAll();
    }
}
