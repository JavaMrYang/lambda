package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestCollections_02 {
    public static void main(String[] args) {
        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };

        List<Person> phpProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
            }
        };
        System.out.println("所有程序员的姓名:");
        phpProgrammers.forEach(person -> System.out.printf("%s %s \n", person.getFirstName(), person.getLastName()));
        javaProgrammers.forEach(person -> System.out.printf("%s %s \n", person.getFirstName(), person.getLastName()));

        System.out.println("给程序员加薪 5% :");
        Consumer<Person> giveSalary = p -> p.setSalary(p.getSalary() / 100 * 5 + p.getSalary());
        phpProgrammers.forEach(giveSalary);
        javaProgrammers.forEach(giveSalary);

        System.out.println("下面是月薪超过 $1,400 的PHP程序员:");
        phpProgrammers.stream()
                .filter(p -> (p.getSalary() > 1400))
                .forEach(p -> System.out.printf("%s %s \n", p.getFirstName(), p.getLastName()));

        Predicate<Person> ageFilter = p -> (p.getAge() > 24);
        Predicate<Person> salaryFilter = p -> (p.getSalary() > 1400);
        Predicate<Person> sexFilter = p -> (p.getGender().equals("female"));

        System.out.println("下面是年龄大于 24岁且月薪在$1,400以上的女PHP程序员:");
        phpProgrammers.stream()
                .filter(ageFilter)
                .filter(salaryFilter)
                .filter(sexFilter).forEach(p -> System.out.printf("%s %s \n", p.getFirstName(), p.getLastName()));

        // 重用filters
        System.out.println("年龄大于 24岁的女性 Java programmers:");
        javaProgrammers.stream()
                .filter(ageFilter)
                .filter(sexFilter).forEach(p -> System.out.printf("%s %s \n", p.getFirstName(), p.getLastName()));


        System.out.println("最前面的3个 Java programmers:");
        javaProgrammers.stream().limit(3)
                .forEach(p -> System.out.printf("%s %s \n", p.getFirstName(), p.getLastName()));

        System.out.println("最前面的3个女性 Java programmers:");
        Predicate<Person> genderFilter = p -> (p.getGender().equals("female"));
        javaProgrammers.stream().limit(3)
                .filter(genderFilter)
                .forEach(p -> System.out.printf("%s %s \n", p.getFirstName(), p.getLastName()));


        System.out.println("根据 name 排序,并显示前5个 Java programmers:");
        List<Person> sortedJavaProgrammers = javaProgrammers.stream()
                .sorted((p1, p2) -> (p1.getFirstName().compareTo(p2.getFirstName())))
                .limit(5)
                .collect(Collectors.toList());
        sortedJavaProgrammers.forEach(p -> System.out.printf("%s %s \n", p.getFirstName(), p.getLastName()));


        System.out.println("根据 salary 排序 Java programmers:");
        List<Person> salaryJavaProgrammers = javaProgrammers.stream()
                .sorted((p1, p2) -> (p1.getSalary() - p2.getSalary()))
                .collect(Collectors.toList());
        salaryJavaProgrammers.forEach(p -> System.out.printf("%s %s %s \n", p.getFirstName(), p.getLastName(), p.getSalary()));

        System.out.println("工资最低的 Java programmer:");
        Person ps = javaProgrammers
                .stream()
                .min((p1, p2) -> (p1.getSalary() - p2.getSalary()))
                .get();
        System.out.printf("%s %s %s \n", ps.getFirstName(), ps.getLastName(), ps.getSalary());

        System.out.println("工资最高的 Java programmer:");
        Person prs = javaProgrammers.stream()
                .max((p1, p2) -> (p1.getSalary() - p2.getSalary()))
                .get();
        System.out.printf("%s %s %s \n", ps.getFirstName(), ps.getLastName(), ps.getSalary());

        System.out.println("将 PHP programmers 的 first name 拼接成字符串:");
        String phpDeveloper = phpProgrammers.stream()
                .map(Person::getFirstName)
                .collect(Collectors.joining(";"));
        System.out.println(phpDeveloper);

        System.out.println("将 Java programmers 的 first name 存放到 Set:");
        Set<String> sets = javaProgrammers.stream()
                .map(Person::getFirstName)
                .collect(Collectors.toSet());
        sets.forEach(name -> System.out.printf("%s \t", name));
        System.out.println();
        System.out.println("将 Java programmers 的 first name 存放到 TreeSet:");
        TreeSet<String> javaDevLastName = javaProgrammers.stream()
                .map(Person::getLastName)
                .collect(Collectors.toCollection(TreeSet::new));
        javaDevLastName.forEach(lastName -> System.out.printf("%s\t", lastName));

        Stack s = new Stack<String>();
        s.push("jack");
        System.out.println(s.peek());
        System.out.println(s.pop());

        Map map=javaProgrammers.stream().collect(Collectors.toMap(Person::getFirstName,Person::getLastName));
        map.forEach((k,v)->{
            System.out.println("key:"+k+",value:"+v);
        });

        Map<String,List<Person>> listMap=javaProgrammers.stream().collect(Collectors.groupingBy(Person::getGender));
        listMap.forEach((k,v)->{
            System.out.printf("key=%s,value=%s \n",k,v);
        });

        //javaProgrammers.stream().collect(Collectors.joining(","));
    }
}
