package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollectionMethod {
    public static void main(String[] args) {
        //Collection 接口实现类的特点
        //可以存放多个元素
        //有些Collection的实现类可以存放多个重复的元素,有些不可以
        //有些Collection的实现类 有些是有序的（List） （Set）是无序的
        //ColLection没有直接实现类 通过他的字接口是实现的
        //Collection常用的方法
        List list = new ArrayList();
        //添加单个元素 是对象类型
        list.add("jacky");
        list.add(10);//自动装箱
        list.add(true);
        System.out.println(list);
        //删除指定对象
        System.out.println(list.remove(0));
        System.out.println(list.remove("jacky"));//输出布尔值

        //查找看元素是否存在 返回布尔值
        System.out.println(list.contains("jacky"));
        //获取元素个数 数组长度
        System.out.println(list.size());
        //判断原属对象是否为空 //返回布尔值
        System.out.println(list.isEmpty());
        //清空元素 clear
        list.clear();
        System.out.println("list=" +list);
        //添加多个元素 可以添加对象
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println(list);
        //查找多个元素是否存在
        System.out.println(list.containsAll(arrayList));
        //删除多个元素
        //System.out.println(list.removeAll(arrayList));
        list.remove(0);
        System.out.println(list);



    }
}
