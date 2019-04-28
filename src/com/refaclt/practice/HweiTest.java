package com.refaclt.practice;

import java.util.Scanner;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/25/025 15:35
 * @Version 1.0
 **/
public class HweiTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入N的长度:");
        int n=sc.nextInt();
        int[] arr=createList(n);
        delArray(arr);
        System.out.println(arr[0]);
    }
    public static int[] createList(int length){
        int[] arr=new int[length+1];
        for(int i=0;i<=length;i++){
            arr[i]=i;
        }
        return arr;
    }



    /*
    有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，
    0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
     */
    public static void delArray(int []arr){
        if(arr.length==0) return;
        while (arr.length!=1){
           for(int i=0;i<arr.length;i+=2){
               for(int j=i;j<arr.length-1;j++){
                   arr[j]=arr[j+1];
               }
           }
        }
    }
}
