package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ��־��
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListExercise {
    public static void main(String[] args) {
        //���10�����ϵ�Ԫ��
        List lt = new ArrayList();
        for (int i = 0; i < 12; i++) {
            lt.add(i,"hello"+(i+1));
        }
        System.out.println(lt);
        //2��λ����һ��Ԫ��
        lt.add(1,"��˳ƽ����");
        System.out.println(lt);
        //��ȡ��5��Ԫ��
        System.out.println(lt.get(4));
        //ɾ����6��Ԫ��
        lt.remove(5);
        System.out.println(lt);
        //�޸ĵ�7��Ԫ��
        System.out.println(lt.set(6,"jin"));
        System.out.println(lt);
        //����������
        Iterator iterator = lt.iterator();
        while(iterator.hasNext()){
            Object object=iterator.next();
            System.out.println(object);
        }
    }
}
