package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListExercise {
    public static void main(String[] args) {
        //添加10个以上的元素
        List lt = new ArrayList();
        for (int i = 0; i < 12; i++) {
            lt.add(i,"hello"+(i+1));
        }
        System.out.println(lt);
        //2号位插入一个元素
        lt.add(1,"韩顺平教育");
        System.out.println(lt);
        //获取第5个元素
        System.out.println(lt.get(4));
        //删除第6个元素
        lt.remove(5);
        System.out.println(lt);
        //修改第7个元素
        System.out.println(lt.set(6,"jin"));
        System.out.println(lt);
        //迭代器遍历
        Iterator iterator = lt.iterator();
        while(iterator.hasNext()){
            Object object=iterator.next();
            System.out.println(object);
        }
    }
}
