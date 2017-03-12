package com.garrytrue.storage;


import com.garrytrue.model.Student;

/**
 * Created by garrytrue on 12.03.17.
 */
public interface IStorage<T> {
    void save(T data);

    T getById(long id);

    void updateById(long id, T data);

    Student deleteById(long id);
}
