package com.gulj.data.structure.array.example;

import com.gulj.data.structure.array.example.type.DynamicArray;
import org.junit.Test;

/**
 * @description: 泛型化，动态数组测试类
 * @author: gulj
 * @create: 2019/3/13 12:39 AM
 **/
public class DynamicArrayTest {

    @Test
    public void testAdd() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        // 初始化默认容量时的数组元素
        for (int i = 0; i < 10; i++) {
            dynamicArray.addLast(i);
        }
        System.out.println("初始化动态数组元素：" + dynamicArray);


        // 动态数组的默认容量是10，现在如果再要添加一个元素，容量会扩充为原来的2倍
        dynamicArray.add(2, 88);
        System.out.println("动态数组扩容：" + dynamicArray);
        dynamicArray.addFirst(-1);
        System.out.println(dynamicArray);

        /**
         * 现在数组中有12个元素（size=12）容量为20（capacity=20）
         *
         * 如果现在我们删除数组中三个元素
         *             当删除第二个元素的时候：
         *                   数组元素的个数（size=10）正好等于数组容量（capacity=20）的一半，此时数组会进行缩容操作
         *
         **/

        dynamicArray.removeFirst();
        System.out.println(dynamicArray);
        dynamicArray.removeFirst();
        System.out.println("动态数组会发生缩容操作：" + dynamicArray);
        dynamicArray.removeFirst();
        System.out.println(dynamicArray);

    }
}
