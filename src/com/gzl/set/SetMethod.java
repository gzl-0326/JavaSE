package com.gzl.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ��־��
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
//      ����
      Iterator it = set.iterator();
      while (it.hasNext()) {
         Object o = it.next();
         System.out.println(o);
      }
      //��ǿforѭ��
      for (Object o:set){
         System.out.println(o);
      }

   }

}
