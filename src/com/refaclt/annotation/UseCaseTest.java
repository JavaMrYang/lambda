package com.refaclt.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author LiuYang
 * @Date 2019/6/14/014  14:24
 * @Version 1.0
 **/
public class UseCaseTest {
    public static void main(String[] args) {
        List<Integer> userCases=new ArrayList<>();
        Collections.addAll(userCases,47,48,49,50);
        trackUseCases(userCases, PasswordUtils.class);
    }

    private static void trackUseCases(List<Integer> userCases, Class<?> c1) {
        for (Method m:c1.getDeclaredMethods()){
            //获得注解的对象
            UseCase.UseCases uc = m.getAnnotation(UseCase.UseCases.class);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.id() + " "
                        + uc.description());
                userCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : userCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }
}
