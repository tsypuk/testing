package com.garrytrue.storage;


import com.garrytrue.model.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garrytrue on 12.03.17.
 * For example some real storage with database
 */
public class StudentStorage implements IStorage<Student> {
    private final Map<Long, Student> dataBase = new HashMap<>();

    @Override
    public void save(Student data) {
        dataBase.put(data.getId(), data);
    }

    @Override
    public Student getById(long id) {
        return dataBase.get(id);
    }

    @Override
    public void updateById(long id, Student data) {
        dataBase.replace(id, data);
    }

    @Override
    public Student deleteById(long id) {
        return dataBase.remove(id);
    }
}
