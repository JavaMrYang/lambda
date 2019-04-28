package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("mack");
        list.add("facker");
        list.forEach(item -> System.out.println(item));


        Map map = new HashMap<>();
        map.put("a", "abc");
        map.put("b", "fsg");
        map.forEach((k, v) -> System.out.println("key:" + k + " value:" + v));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

        List<String> listStr = Arrays.asList(new String[]{"c", "b", "a", "g", "e"});
        Collections.sort(listStr, (str1, str2) -> str1.compareTo(str2));
        listStr.forEach((str) -> System.out.print(str + ","));

        System.out.println(String.format("event%06d", 1));
    }
}
