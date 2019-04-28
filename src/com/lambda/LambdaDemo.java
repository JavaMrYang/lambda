package com.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        List<Person> persons = (List<Person>) personsToList();
        persons = persons.stream().filter(p -> p.getAge() > 6)
                // .filter(p->p.getAge()==1)
                .filter(p -> p.getName().contains("张"))
                .collect(Collectors.toList());
        persons.forEach(p -> System.out.printf("姓名:%s 年龄:%d \n", p.getName(), p.age));
    }

    public static List<? extends Person> personsToList() {
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            Person person = new Person();
            person.setName(i + "张三");
            person.setAge(18 - i);
            personList.add(person);
        }
        return personList;
    }


    static class Person {
        Integer age;
        String name;

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
