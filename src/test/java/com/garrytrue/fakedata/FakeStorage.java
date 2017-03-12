package com.garrytrue.fakedata;


import com.garrytrue.model.Student;
import com.garrytrue.storage.IStorage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garrytrue on 12.03.17.
 */
public class FakeStorage implements IStorage<Student> {
    private final Map<Long, Student> dataBase = new HashMap<>();

    {
        for (int i = 0; i < 10; i++) {
            dataBase.put((long) i, new Student(i, "FirstName " + i, "SecondName " + i));
        }
    }

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
        return null;
    }
}
