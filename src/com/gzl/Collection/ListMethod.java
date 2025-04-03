package com.gzl.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郭志龙
 * @version 1.0
 */
//接口常用的方法
 @SuppressWarnings({"all"})
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        //在指定位置插入某个元素
        list.add(1, "小黑黑");
        System.out.println(list);
        //从某个位置开始把所有元素加进来
        List list2=new ArrayList();
        list2.add("jacky");
        list2.add("tomy");
        list.addAll(1,list2);
        System.out.println(list);
        //获取指定位置的元素 返回Object对象!!1
        System.out.println(list2.get(0));
        //某个元素首次出现的位置
        System.out.println(list2.indexOf("jacky"));
        list2.add(1,"jacky");
        //元素末次出现的位置lastIndexOf
        System.out.println(list2.lastIndexOf("jacky"));
        //remove移除此元素并返回此元素 Object
        list2.remove(0);
        System.out.println(list2);
        //替换 替换某位置的元素 并返回该对象
        list2.set(0,"dqwd");
        System.out.println(list2);
        //返回从某个位置到某个位置的子集合
        List list3 =list2.subList(0,2);
        System.out.println(list3);
        list2.remove("jacky");

    }
}
//增 add 对象 (布尔值)指定位置 +对象() 不能搁空插
// addAll(布尔值)增加列表
//删 remove 同上
//改 set (位置,对象) 返回对象呢
//查 get(位置) Object
//indexOf lastIndexOf
//subList返回子集合 大于等于指数小于指数

