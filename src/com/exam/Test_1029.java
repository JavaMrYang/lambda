package com.exam;

public class Test_1029 {
    public static void main(String[] args) {
        int[][] ab={
                {1,4,2},
                {5,8,6}
        };
        printArray(ab);
    }

    public static void printArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
