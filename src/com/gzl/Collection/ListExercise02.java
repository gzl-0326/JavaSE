package com.gzl.Collection;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ��־��
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        //List��ʵ����������������ð������
        List arrayList = new ArrayList();
        arrayList.add(new Book("��������",123,"�޹���"));
        arrayList.add(new Book("���μ�",145,"��ж�"));
        arrayList.add(new Book("ˮ䰴�",119,"ʩ����"));
        //ð������ ��������
        sort(arrayList);
        for (Object object :arrayList) {
            System.out.println(object);
        }
        //˼���������������
        System.out.println("HelloWord");


    }
    //��д��̬����
    public static  void sort(List list){
        //ð������,�Լ��ϵĶ����ȡ
        //��ȡ����Ĵ�С
        int length =list.size();
        for (int i = 0; i <length-1 ; i++) {
            for (int j = 0; j < length-1-i; j++) {
                //��ü����е�ֵ ���ϵ�ֵ�� get��õ���Object
                Book book=(Book)list.get(j);
                Book book1=(Book)list.get(j+1);
                //��ü۸��ֵ
                if(book.getPrice()>book1.getPrice()){
                    //���ļ���ֵ��λ��
                    list.set(j,book1);
                    list.set(j+1,book);
                }
            }
        }

    }
}

class Book{
    //��������

    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "����:" +name +"\t\t" +"�۸�"+price+"\t\t"
              +  "����"+author;
    }
}
