package com.gulj.data.structure.array.example;

import org.junit.Test;

/**
 * @description: 数组测试类
 * @author: gulj
 * @create: 2019/3/10 4:10 PM
 **/

public class ArrayTest {

    @Test
    public void testAdd() {
        // 初始化数组容量大小为5，目前数组中没有任何元素
        Array arrayExample = new Array(5);
        System.out.println(arrayExample);

        // 向数组中欧添加第一个元素
        arrayExample.addFirst(1);
        System.out.println(arrayExample);

        // 向数组中添加最后一个元素
        arrayExample.addLast(2);
        System.out.println(arrayExample);

        // 向数组中索引为0的位置添加元素
        arrayExample.add(0, 10);
        System.out.println(arrayExample);
    }

    // TODO 其它测试方法，读者可以自行测试
}
