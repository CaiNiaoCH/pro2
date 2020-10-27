package com.chenhao.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author chenhao
 * @date 2020/10/27 - 11:15
 */
public class Hello {
    //region Description
    private int age;
    private String name;
    private int num;

    //endregion


    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

    }

    public void test1() {
        num = 10;
        ArrayList list1 = new ArrayList<>();
        list1.add(1, "s");
    }

    public void test2() {
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
