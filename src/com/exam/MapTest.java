package com.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2019/1/8/008 11:59
 * @Version 1.0
 **/
public class MapTest {
    public static void main(String[] args) {
        Map map=new HashMap<String,Object>();
        map.put("sd","dgdf");
        System.out.println(map.get("sd"));
    }
}
