package com.gulj.data.structure.array.example.type;

import java.util.Arrays;

/**
 * @description: 改造静态数组，实现动态数组（Java版）
 * <p>
 * 思路：
 * 当进行数组添加操作时：
 * 1、如果数组已经满了，重新生成一个比之前数组容量大的新数组
 * 2、然后将原来数组中的元素内容拷贝到新的数组中
 * 3、最后改变一下引用地址
 * @author: gulj
 * @create: 2019/3/13 12:15 AM
 **/
@SuppressWarnings("all")
public class DynamicArray<E> extends GenericsArray<E> {

    /**
     * 重写泛型化后的静态数组添加方法，当数组满时，进行扩容操作，实现动态数组
     *
     * @param index   指定索引
     * @param element 插入的元素
     */
    @Override
    public void add(int index, E element) {
        // 简单的边界判断
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index索引不合法");
        }

        // 当数组满时，进行扩容操作(扩容为原来的2倍，具体扩容多少倍可以根据具体场景分析)
        if (size == data.length) {
            resize(2 * data.length); // TODO 新增扩容，其它操作和之前的静态数组一样
        }

        // 从最后一个元素一直到size位置的元素，往后挪动一位
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        // 位置赋值
        data[index] = element;

        // 维护size大小
        size++;
    }


    /**
     * 重写泛型化后的静态数组删除方法，当数组进行扩容之后；执行删除操作，当数组中元素的个数等于数组容量的一半时，进行数组缩容操作
     *
     * @param index
     * @return
     */
    @Override
    public E remove(int index) {
        // 简单判断数组索引的合法性
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("删除数组元素失败，索引不合法");
        }

        // 存放删除指定索引的位置元素
        E result = data[index];
        // 从删除指定索引的后一个位置，一直往前挪一位，直到最后一个元素
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }

        // 维护size的位置
        size--;
        data[size] = null;

        // 当数组中元素的个数等于容量的一半时候，进行，数组缩容
        if (size == data.length / 2) {
            resize(data.length / 2);  // TODO 新增缩容，其它操作和之前的静态数组一样
        }

        return result;
    }


    /**
     * 数组扩容或者缩容（2倍/一半）
     *
     * @param newCapacity 新的容量
     */
    private void resize(int newCapacity) {
        // 生成新数组
        E[] newData = (E[]) new Object[newCapacity];

        // 将原来数组中的元素，赋值到新数组中(注意，是小于size，size表示数组中元素的个数)
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        // 将原来数组的引用指向新的数组
        data = newData;
    }


    @Override
    public String toString() {
        return "DynamicArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size + ",capacity=" + data.length +
                '}';
    }
}
