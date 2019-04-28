package com.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        // 去空
        List<String> list = Arrays.asList("悟空", "", "唐僧", "八戒", "悟净", "白龙马");
        List<String> newList = list.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(newList);

        //求偶数
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Integer[] eventNums = Stream.of(nums).filter(integer -> integer % 2 == 0).toArray(Integer[]::new);
        Arrays.asList(eventNums).forEach(i -> System.out.printf("%d,", i));
        System.out.println();

        //求偶数个数
        Integer[] num1s = {1, 2, 3, 4, 5, 6};
        long count = Stream.of(num1s).filter(i -> i % 2 == 0).count();
        System.out.println(count);

        //返回集合中各异的元素集合(去重)
        Integer[] numbers = {5, 1, 2, 1, 3, 3, 2, 4};
        Integer[] newNumbers = Stream.of(numbers).distinct().toArray(Integer[]::new);
        Arrays.asList(newNumbers).forEach(i -> System.out.printf("%d,", i));
        System.out.println();
        /*
        limit()：截取流中指定数量的元素，返回一个不超过给定长度的流。如果流是有序的，则最多会返回前n个元素。
        如果我们要得到一组数前3个大于100的数，应该怎么编码呢？
         */
        Integer[] num2s = {100, 30, 400, 200, 600, 20, 800};
        Integer[] newNums2 = Stream.of(num2s).filter(integer -> integer > 100).limit(3).toArray(Integer[]::new);
        Arrays.asList(newNums2).forEach(i -> System.out.printf("%d,", i));
        System.out.println();
        //skip()：跳过指定数量元素，返回一个扔掉了前n个元素的流。如果流中元素不足n个，则返回一个空流。
        Integer[] nums2 = {100, 30, 400, 200, 600, 20, 800};
        Integer[] newNumber3s = Stream.of(nums2).skip(2).toArray(Integer[]::new);
        System.out.println(Arrays.toString(newNumber3s));

        //map()：接受一个函数作为参数。这个函数会被应用到每个元素上，并将其映射成一个新的元素。以下代码片段使用 map 输出了元素对应的平方数：
        Integer[] nums3 = {2, 3, 5, 6, 7, 9, 8};
        Integer[] newNum4 = Stream.of(nums3).map(m -> m * m).toArray(Integer[]::new);
        System.out.println(Arrays.toString(newNum4));

        /*匹配比较简单，返回一个boolean
        - anyMatch()：至少匹配一个
        - allMatch()：全部匹配
        - noneMatch()：全部不匹配，和allMatch相反*/
        Integer[] num4s = {2, 3, 5, 6, 7, 9, 8};
        //是否有存在偶数.
        boolean isEven = Stream.of(num4s).anyMatch(integer -> integer % 2 == 0);
        System.out.println(isEven);
        //是否全部是偶数.
        System.out.println(Stream.of(num4s).allMatch(integer -> integer % 2 == 0));
        //是否全部不是偶数
        System.out.println(Stream.of(num4s).noneMatch(integer -> integer % 2 == 0));

        /*查找有2个方法：findFirst()和findAny()，返回一个Optional<T>集合。
        如果你不关心返回的元素是哪个，请使用findAny()，因为它在使用并行流时限制较少。*/
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //找到第一个能够被3整除的数
        Optional<Integer> findFirstOptional = someNumbers.stream()
                .filter(i -> i % 3 == 0).findFirst();
        System.out.println(findFirstOptional.get());

        findFirstOptional = someNumbers.stream()
                .filter(i -> i % 3 == 0).findAny();
        System.out.println(findFirstOptional.get());

        //归约在汇总结合内所有数据的时候使用。比如求 max，min，sum。
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = integers.stream().mapToInt((i) -> i).summaryStatistics();

        //列表中最大的数 : 5
        System.out.println("列表中最大的数 : " + stats.getMax());
        //列表中最小的数 : 1
        System.out.println("列表中最小的数 : " + stats.getMin());
        //所有数之和 : 15
        System.out.println("所有数之和 : " + stats.getSum());
        //平均数 : 3.0
        System.out.println("平均数 :" + stats.getAverage());
    }
}
