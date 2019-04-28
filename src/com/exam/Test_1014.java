package com.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Trie {
    private char[] prefix;
    private char[] value;
    private List<char[]> tries = null;

    public Trie() {
        tries = new ArrayList<>();
    }

    public Trie(String prefix, String... args) {
        this.prefix = prefix.toCharArray();
        tries = new ArrayList<>();
        Arrays.asList(args).forEach(str -> tries.add(str.toCharArray()));
    }

    public void findTrieByPrefix() {
        tries.forEach(word -> {
            if (word.toString().startsWith(this.prefix.toString())) {
                System.out.println(word.toString().indexOf(this.prefix.toString()));
            }
        });
    }
}

public class Test_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入构造的trie数单词");
        while (sc.hasNext()) {
            int a = sc.nextInt();
            String[] strs = new String[a];
            for (int i = 0, len = a; i < len; i++) strs[i] = sc.next();
            System.out.println("请输入查找的trie树单词开头");
            String prefix = sc.next();
            new Trie(prefix, strs).findTrieByPrefix();
        }
    }
}
