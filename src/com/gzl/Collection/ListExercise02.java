package com.gzl.Collection;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 郭志龙
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        //List的实现类添加三本书遍历冒泡排序
        List arrayList = new ArrayList();
        arrayList.add(new Book("三国演义",123,"罗贯中"));
        arrayList.add(new Book("西游记",145,"吴承恩"));
        arrayList.add(new Book("水浒传",119,"施耐庵"));
        //冒泡排序 交换对象
        sort(arrayList);
        for (Object object :arrayList) {
            System.out.println(object);
        }
        //思考这与数组的区别
        System.out.println("HelloWord");


    }
    //编写静态方法
    public static  void sort(List list){
        //冒泡排序,对集合的对象获取
        //获取对象的大小
        int length =list.size();
        for (int i = 0; i <length-1 ; i++) {
            for (int j = 0; j < length-1-i; j++) {
                //获得集合中的值 集合的值是 get获得的是Object
                Book book=(Book)list.get(j);
                Book book1=(Book)list.get(j+1);
                //获得价格的值
                if(book.getPrice()>book1.getPrice()){
                    //更改集合值得位置
                    list.set(j,book1);
                    list.set(j+1,book);
                }
            }
        }

    }
}

class Book{
    //定义属性

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
        return "名称:" +name +"\t\t" +"价格"+price+"\t\t"
              +  "作者"+author;
    }
}
