package com.gzl.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author ��־��
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollectionMethod {
    public static void main(String[] args) {
        //Collection �ӿ�ʵ������ص�
        //���Դ�Ŷ��Ԫ��
        //��ЩCollection��ʵ������Դ�Ŷ���ظ���Ԫ��,��Щ������
        //��ЩCollection��ʵ���� ��Щ������ģ�List�� ��Set���������
        //ColLectionû��ֱ��ʵ���� ͨ�������ֽӿ���ʵ�ֵ�
        //Collection���õķ���
        List list = new ArrayList();
        //��ӵ���Ԫ�� �Ƕ�������
        list.add("jacky");
        list.add(10);//�Զ�װ��
        list.add(true);
        System.out.println(list);
        //ɾ��ָ������
        System.out.println(list.remove(0));
        System.out.println(list.remove("jacky"));//�������ֵ

        //���ҿ�Ԫ���Ƿ���� ���ز���ֵ
        System.out.println(list.contains("jacky"));
        //��ȡԪ�ظ��� ���鳤��
        System.out.println(list.size());
        //�ж�ԭ�������Ƿ�Ϊ�� //���ز���ֵ
        System.out.println(list.isEmpty());
        //���Ԫ�� clear
        list.clear();
        System.out.println("list=" +list);
        //��Ӷ��Ԫ�� ������Ӷ���
        ArrayList arrayList = new ArrayList();
        arrayList.add("��¥��");
        arrayList.add("��������");
        list.addAll(arrayList);
        System.out.println(list);
        //���Ҷ��Ԫ���Ƿ����
        System.out.println(list.containsAll(arrayList));
        //ɾ�����Ԫ��
        //System.out.println(list.removeAll(arrayList));
        list.remove(0);
        System.out.println(list);



    }
}
