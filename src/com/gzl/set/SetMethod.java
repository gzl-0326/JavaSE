package com.gzl.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SetMethod {
   public static void main(String[] args) {
      Set set=new HashSet();
      set.add("join");
      set.add("lucky");
      set.add("join");
      set.add("null");
      set.add("mary");
      set.remove("join");
      for (int i = 0; i < 10; i++) {
         System.out.println("set="+set) ;
      }
//      遍历
      Iterator it = set.iterator();
      while (it.hasNext()) {
         Object o = it.next();
         System.out.println(o);
      }
      //增强for循环
      for (Object o:set){
         System.out.println(o);
      }

   }

}
