package com.garrytrue.repository;

/**
 * Created by garrytrue on 12.03.17.
 */
public interface IRepository<T> {

    void save(T data);

    T get(long id);

    void update(T data);
}
