package com.feedbacks.main.services;

import java.util.List;

public interface Service<T, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(T object);
    T update(ID id, T newObject);
    boolean delete(ID id);
}
