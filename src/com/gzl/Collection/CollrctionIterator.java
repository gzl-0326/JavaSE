package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollrctionIterator {
    public static void main(String[] args) {
        //迭代器的使用  Collection 接口遍历元素
        //接口 Collection 中有一个方法 iterator 返回 Iterator 对象
        //使用接口中的  hasNext 方法判断有没有元素 next方法返回对象
        //实现了Collection接口均可用此方法
        ArrayList arrayList = new ArrayList();
        arrayList.add("小妹");
        arrayList.add("小虎");
        //遍历快捷键 itit 快捷键的快捷键 ctrl+j
        Iterator col =arrayList.iterator();//返回对象
        while (col.hasNext()) {
            Object next =  col.next();
            System.out.println(next);
        }

       //col.next();//想要重新遍历就必须重置对象 col=arrList.iterator
        //增强for循环遍历底层与迭代器一样
        for (Object o :arrayList) {
            System.out.println("obj=" +o);
        }
        //正常遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
