package com.garrytrue.repository;

/**
 * Created by garrytrue on 12.03.17.
 */
public interface CRUDRepository<T> {

    T save(T data);

    T get(long id);

    T update(T data);

    void delete(T data);

    void deleteAll();
}
