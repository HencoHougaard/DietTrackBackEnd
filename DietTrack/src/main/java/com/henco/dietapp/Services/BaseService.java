package com.henco.dietapp.Services;

public interface BaseService<E, ID> {
    E save(E id);
    E findById(String s);
    E update(E id);
    void delete(E id);
}
