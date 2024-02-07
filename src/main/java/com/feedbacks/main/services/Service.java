package com.feedbacks.main.services;

import com.feedbacks.main.exceptions.NotFoundException;

import java.util.List;

public interface Service<T, R, ID> {
    List<T> findAll();
    T findById(ID id) throws NotFoundException;
    T save(R object) throws NotFoundException;
    T update(ID id, R newObject) throws NotFoundException;
    boolean delete(ID id) throws NotFoundException;
}