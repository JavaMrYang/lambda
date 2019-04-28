package com.company;

import java.util.Optional;

public class TestCollections_03 {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(String.join(",",str));

        Optional<String> optional=Optional.of("dsgd");
        printStr(optional.isPresent());
        printStr(optional.get());
        printStr(optional.orElse("fallback"));
        optional.ifPresent(p-> System.out.println(p.charAt(0)));
    }
    public static void printStr(Object obj){
       /* if(obj instanceof Boolean){
            System.out.println(obj);
        }*/
        System.out.println(obj);
    }
}
