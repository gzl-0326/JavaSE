package com.gzl.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ��־��
 * @version 1.0
 */
//�ӿڳ��õķ���
 @SuppressWarnings({"all"})
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("������");
        list.add("�ֱ���");
        //��ָ��λ�ò���ĳ��Ԫ��
        list.add(1, "С�ں�");
        System.out.println(list);
        //��ĳ��λ�ÿ�ʼ������Ԫ�ؼӽ���
        List list2=new ArrayList();
        list2.add("jacky");
        list2.add("tomy");
        list.addAll(1,list2);
        System.out.println(list);
        //��ȡָ��λ�õ�Ԫ�� ����Object����!!1
        System.out.println(list2.get(0));
        //ĳ��Ԫ���״γ��ֵ�λ��
        System.out.println(list2.indexOf("jacky"));
        list2.add(1,"jacky");
        //Ԫ��ĩ�γ��ֵ�λ��lastIndexOf
        System.out.println(list2.lastIndexOf("jacky"));
        //remove�Ƴ���Ԫ�ز����ش�Ԫ�� Object
        list2.remove(0);
        System.out.println(list2);
        //�滻 �滻ĳλ�õ�Ԫ�� �����ظö���
        list2.set(0,"dqwd");
        System.out.println(list2);
        //���ش�ĳ��λ�õ�ĳ��λ�õ��Ӽ���
        List list3 =list2.subList(0,2);
        System.out.println(list3);
        list2.remove("jacky");

    }
}
//�� add ���� (����ֵ)ָ��λ�� +����() ���ܸ�ղ�
// addAll(����ֵ)�����б�
//ɾ remove ͬ��
//�� set (λ��,����) ���ض�����
//�� get(λ��) Object
//indexOf lastIndexOf
//subList�����Ӽ��� ���ڵ���ָ��С��ָ��

