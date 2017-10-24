package com.henco.dietapp.Services;

import com.henco.dietapp.Domain.User;

public interface UserService extends BaseService<User, String>{
    Iterable<User> findAll();
}
