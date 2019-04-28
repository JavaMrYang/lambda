package com.refaclt;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            //1.获取Student class对象
            Class stuClass=Class.forName("com.refaclt.Student");
            //2.获取main方法
            Method md=stuClass.getMethod("main", String[].class);
            //3.调用main方法
            //md.invoke(null,new String[]{"a","b","c"});
            //第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数是String数组，这里要注意在jdk1.4时是数组，jdk1.5之后是可变参数
            //这里拆的时候将  new String[]{"a","b","c"} 拆成3个对象。。。所以需要将它强转。
            // md.invoke(stuClass,(Object) new String[]{"a","b","c"});
            md.invoke(null, new Object[]{new String[]{"a","b","c"}});
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
