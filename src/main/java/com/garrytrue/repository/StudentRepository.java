package com.garrytrue.repository;


import com.garrytrue.model.Student;
import com.garrytrue.storage.IStorage;

/**
 * Created by garrytrue on 12.03.17.
 */
public class StudentRepository implements IRepository<Student> {
    private final IStorage<Student> storage;

    public StudentRepository(IStorage<Student> storage) {
        this.storage = storage;
    }

    @Override
    public void save(Student data) {
        storage.save(data);
    }

    @Override
    public Student get(long id) {
        return storage.getById(id);
    }

    @Override
    public void update(Student data) {
        storage.updateById(data.getId(), data);
    }


}
