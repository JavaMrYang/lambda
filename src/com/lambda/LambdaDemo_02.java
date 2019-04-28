package com.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaDemo_02 {
    public static void main(String[] args) {
        Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", " ", "")
                .stream()
                //.filter(str->str.toLowerCase().startsWith("j")) //startWith方法不区分大小写
                //.filter(str->str.endsWith("a"))
                .collect(Collectors.toList())
                .forEach(s -> System.out.printf("%s\t", s));

        Arrays.asList("aa","bb","bb").stream().distinct()
                .forEach(s-> System.out.println(s));

        Integer[] a={1,5,8,2,3,9,40};
        Arrays.sort(a,(a1,a2)->{
            return a1-a2;
        });
        Arrays.asList(a).forEach(integer -> System.out.print(integer+","));
    }
}
