package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2019/1/3/003 15:35
 * @Version 1.0
 **/
public class LambdaDemo_03 {
    public static void main(String[] args) {
        /*Map<String,Integer> items=new HashMap<>();
        items.put("A",10);
        items.put("B",20);
        items.put("C",30);
        items.put("D",40);
        items.put("E",50);
        items.put("F",60);
        items.forEach((k,v)-> System.out.println("Item:"+k+" Count:"+v));*/

        List<Integer> num1= Arrays.asList(1,2,3,4);
        List<Integer> squareNums=num1.stream().map(n->n*n).collect(Collectors.toList());
        squareNums.forEach(n-> System.out.print(n+","));
        System.out.println();

        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());
        outputStream.forEach(out-> System.out.print(out+","));


    }
}
