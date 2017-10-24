package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.User;
import com.henco.dietapp.Repositories.UserRepository;
import com.henco.dietapp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public User findById(String s) { return userRepository.findOne(s); }


    @Override
    public User update(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public void delete(User entity)
    {
        userRepository.delete(entity);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
