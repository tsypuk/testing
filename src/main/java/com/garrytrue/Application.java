package com.garrytrue;

import com.garrytrue.model.Student;
import com.garrytrue.repository.RepositoryBuilder;
import com.garrytrue.repository.impl.ChainedRepository;
import com.garrytrue.repository.impl.StudentInMemoryRepository;
import com.garrytrue.repository.impl.StudentRESTRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        HashMap<Long, Student> storage = new HashMap<>();
        List<Student> restStorage = new ArrayList<>();
        StudentRESTRepository rest = new StudentRESTRepository(restStorage);
        StudentInMemoryRepository memory = new StudentInMemoryRepository(storage);
        ChainedRepository chainedRepo = new RepositoryBuilder()
                .addToChain(memory)
                .addToChain(rest)
                .build();
    }
}