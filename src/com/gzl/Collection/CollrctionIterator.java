package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ��־��
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollrctionIterator {
    public static void main(String[] args) {
        //��������ʹ��  Collection �ӿڱ���Ԫ��
        //�ӿ� Collection ����һ������ iterator ���� Iterator ����
        //ʹ�ýӿ��е�  hasNext �����ж���û��Ԫ�� next�������ض���
        //ʵ����Collection�ӿھ����ô˷���
        ArrayList arrayList = new ArrayList();
        arrayList.add("С��");
        arrayList.add("С��");
        //������ݼ� itit ��ݼ��Ŀ�ݼ� ctrl+j
        Iterator col =arrayList.iterator();//���ض���
        while (col.hasNext()) {
            Object next =  col.next();
            System.out.println(next);
        }

       //col.next();//��Ҫ���±����ͱ������ö��� col=arrList.iterator
        //��ǿforѭ�������ײ��������һ��
        for (Object o :arrayList) {
            System.out.println("obj=" +o);
        }
        //��������
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
