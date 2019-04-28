package com.exam;

import java.util.Scanner;

/*求两个整数A+B的和

        输入
        输入包含多组数据。
        每组数据包含两个整数A(1 ≤ A ≤ 100)和B(1 ≤ B ≤ 100)。

        输出
        对于每组数据输出A+B的和。*/
public class Test_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        while (sc.hasNext()) {
            int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
            if (check(a) && check(b)) {
                sum = a + b;
                System.out.println(sum);
            }
        }

    }

    static boolean check(Integer a) {
        if (a < 1 || a > 100) {
            System.out.println("您输入的数不能超过1到100");
            return false;
        }
        return true;
    }
}
