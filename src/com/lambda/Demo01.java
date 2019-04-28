package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        String[] arr={"张三","李四","王五","哈哈"};
        List<String> list=null;
        Collections.reverse((list=Arrays.asList(arr)));
        list.forEach(s -> System.out.printf("%s,",s));
        StudentDao studentDao1=new StudentDao() {
            @Override
            public int getCount() {
                return 5;
            }
        };
       StudentDao studentDao2=()->{
            return 10;
        };

        System.out.println( studentDao1.getCount());
        System.out.println( studentDao2.getCount());
    }
}
