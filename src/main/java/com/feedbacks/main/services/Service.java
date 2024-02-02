package com.feedbacks.main.services;

import java.util.List;

public interface Service<T, R, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(R object);
    T update(ID id, R newObject);
    boolean delete(ID id);
}
