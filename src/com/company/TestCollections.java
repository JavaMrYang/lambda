package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = null;
        for (int i = 1; i <= 5; i++) {
            int j = Math.round((float) Math.random() * 5);
            student = new Student(i, "jack" + i, j + 5);
            students.add(student);
        }
        /*Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()>o2.getAge()){
                    return o1.getAge();
                }
                return -1;
            }
        });*/
        Collections.sort(students, (s1, s2) -> {
            if (s1.getAge() > s2.getAge())
                return s1.getAge();
            return -1;
        });
        students.forEach(s -> System.out.println(s));


    }
}
