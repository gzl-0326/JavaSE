package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollectionExercise {
    public static void main(String[] args) {
        //创建 3个Dog对象 放入Arrlist赋给 list使用
        //迭代器使用
        //重写toString方法 输出name和age

        Dog dog1 = new Dog("小花", 10);
        Dog dog2 = new Dog("小从", 11);
        Dog dog3 = new Dog("小2", 12);
        List lt=new ArrayList();
        lt.add(dog1);
        lt.add(dog2);
        lt.add(dog3);
        //迭代器
        Iterator iterator =lt.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj="+next);
        }
//        for循环遍历
        for(Object o:lt){
            System.out.println("obj=" + o);
        }


    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}