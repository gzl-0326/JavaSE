package com.gzl.Collection;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ��־��
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListFor {
    public static void main(String[] args) {
//        List�ӿ�ʵ�ֵ����� ArrayList Vector LinkedList
        //list�ӿڵ����ֱ�������
        //������
        List arrayList = new ArrayList();
        arrayList.add("f2");
        Iterator tt =arrayList.iterator();
        System.out.println(tt.next().getClass());//��������arrayListֻ��һ���������������һ��tt.next�ᵼ�µ�������ֹ����
        tt =arrayList.iterator();//����취���ö���
        while(tt.hasNext()){
           Object vv =tt.next();
            System.out.println("obj="+vv);
        }
//        //��ǿforѭ��
//        for (Object c:arrayList) {
//            System.out.println("obj="+c);
//        }
//        //forѭ��
//        int k=arrayList.size();
//        for(int i=0;i<k;i++){
//            System.out.println("obj="+arrayList.get(i));
//        }
        }
}
