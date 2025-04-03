package com.gzl.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟HashSet的底层结构
        //创建Node数组
        Set set=new HashSet();
        set.add("java");
        set.add("php");
        set.add("java");
        System.out.println("set="+set);
        /*
        源码解读

         */
    }
}
