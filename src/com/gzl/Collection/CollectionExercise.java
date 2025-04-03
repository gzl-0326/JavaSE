package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ��־��
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollectionExercise {
    public static void main(String[] args) {
        //���� 3��Dog���� ����Arrlist���� listʹ��
        //������ʹ��
        //��дtoString���� ���name��age

        Dog dog1 = new Dog("С��", 10);
        Dog dog2 = new Dog("С��", 11);
        Dog dog3 = new Dog("С2", 12);
        List lt=new ArrayList();
        lt.add(dog1);
        lt.add(dog2);
        lt.add(dog3);
        //������
        Iterator iterator =lt.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj="+next);
        }
//        forѭ������
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