package com.garrytrue;

import com.garrytrue.model.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garrytrue on 12.03.17.
 */
public final class TestUtils {
    private TestUtils() {
        throw new AssertionError("Don't make instance");
    }

    public static Student createStudent() {
        return new Student("One", "One");
    }

    public static Map<Long, Student> generateStudents(int count) {
        Map<Long, Student> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            map.put((long) i, new Student("FirstName " + i, "LastName " + i));
        }
        return map;
    }

}
