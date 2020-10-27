package com.chenhao.bean;

import com.company.HelloWorld;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author chenhao
 * @date 2020/10/27 - 13:46
 */
public class TemplateTest {

    //自定义模板 test
    public void testAdd() {

    }

    //自定义模板
    /**
     * 年龄
     *
    */
    private int age = 1;


    //模板6：prsf 可生成private static final
    private static final HelloWorld hw = new HelloWorld();

    //psf
    public static final int num1 = 1;

    //psfi
    public static final int num2 = 1;

    //psfs
    public static final String str = "j";

    //模板一：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        int num1 = 10;
        System.out.println("num1 = " + num1);

        System.out.println("TemplateTest.main");

        //模板3:for
        String[] arr = {"tim", "tom", "jack"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }

        //iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }

        //模板4：list.fori
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void test1() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(345);

        ////模板5 ifn
        if (list == null) {

        }

        //变形：ifnn
        if (list != null) {

        }

        //xxx.nn
        if (list != null) {

        }

        //xxx.null
        if (list == null) {

        }
    }

    public void test2() {

    }
}
