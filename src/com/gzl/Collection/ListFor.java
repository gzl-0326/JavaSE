package com.gzl.Collection;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListFor {
    public static void main(String[] args) {
//        List接口实现的子类 ArrayList Vector LinkedList
        //list接口的三种遍历方法
        //迭代器
        List arrayList = new ArrayList();
        arrayList.add("f2");
        Iterator tt =arrayList.iterator();
        System.out.println(tt.next().getClass());//由于这里arrayList只有一个对象，这里调用了一次tt.next会导致迭代器终止遍历
        tt =arrayList.iterator();//解决办法重置对象
        while(tt.hasNext()){
           Object vv =tt.next();
            System.out.println("obj="+vv);
        }
//        //增强for循环
//        for (Object c:arrayList) {
//            System.out.println("obj="+c);
//        }
//        //for循环
//        int k=arrayList.size();
//        for(int i=0;i<k;i++){
//            System.out.println("obj="+arrayList.get(i));
//        }
        }
}
