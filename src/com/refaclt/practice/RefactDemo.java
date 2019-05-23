package com.refaclt.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/24/024 10:40
 * @Version 1.0
 **/
public class RefactDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       RefactDemo rd=new RefactDemo();
       rd.reFactAdd(new ArrayList<>());
       newObject1();
       newObject2();
       rd.printStr();
      ArrayList<Integer> list= new ArrayList<>();
      for(int i=0;i<5;i++){
          list.add(i*2);
      }
      Collections.reverse(list);
      list.forEach(l->{
          System.out.printf("%s ,",l);
      });
    }

    /**
     * 通过构造函数实例化对象
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void newObject1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       Class obj=Class.forName("com.company.Person");
       Constructor constructor=obj.getConstructor(String.class,String.class,String.class,String.class,int.class,int.class);
       Object o=constructor.newInstance("张","使","","15",20,18);
        System.out.println(o);
    }

    public void printStr() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class classz=Class.forName("com.company.Person");
        Object obj=classz.newInstance();
        Method method=classz.getMethod("printStr");
        method.invoke(obj);
    }

    public static void newObject2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class obj=Class.forName("com.company.Person");
        Object o=obj.newInstance();
        System.out.println(o);
    }

    //1.反射擦除
    public void reFactAdd(List<String> list){
        list.add("张三");
        //反射添加
        try {
          Class c=Class.forName("java.util.ArrayList");
          Method method=c.getMethod("add",Object.class);
          method.invoke(list,"李四");
          Iterator it=list.iterator();
          while (it.hasNext()){
             Object obj=it.next();
             System.out.println(obj);
          }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
