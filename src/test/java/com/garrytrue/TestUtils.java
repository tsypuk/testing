package com.garrytrue;

import com.garrytrue.model.Student;

/**
 * Created by garrytrue on 12.03.17.
 */
public final class TestUtils {
    private TestUtils() {
        throw new AssertionError("Don't make instance");
    }

    public static Student getStudent1() {
        return new Student(1, "One", "One");
    }

}
