package com.gulj.data.structure.array.example;

import java.util.Arrays;

/**
 * @description: 静态数组（Java版）
 * @author: gulj
 * @create: 2019/3/10 11:12 AM
 **/
public class Array {
    /**
     * 存放数组的元素
     */
    private int data[];

    /**
     * 数组中元素的个数
     */
    private int size;

    /**
     * 根据指定capacity容量初始化数组
     *
     * @param capacity 容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，指定默认数组容量capacity=10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中元素的个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组容量
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }


    /**
     * 在index位置插入元素
     *
     * @param index   指定索引
     * @param element 插入的元素
     */
    public void add(int index, int element) {
        // 简单的边界判断
        if (size == data.length) {
            throw new IllegalArgumentException("数组添加失败，数组已满");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index索引不合法");
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
     * 向数组头的位置添加元素
     *
     * @param element 元素
     */
    public void addFirst(int element) {
        add(0, element);
    }

    /**
     * 向数组尾的位置添加元素
     *
     * @param element 元素
     */
    public void addLast(int element) {
        add(size, element);
    }


    /**
     * 获取index索引位置的元素
     *
     * @param index 索引
     * @return
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("获取失败，索引不合法");
        }
        return data[index];
    }

    /**
     * 修改index索引位置的元素为element
     *
     * @param index   索引
     * @param element 元素
     */
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("获取失败，索引不合法");
        }
        data[index] = element;
    }

    /**
     * 查找数组中是否有元素element
     *
     * @param element
     * @return
     */
    public boolean contains(int element) {
        return Arrays.stream(data).filter(x -> x == element).findAny().isPresent();
    }

    /**
     * 查找数组中元素element所在的索引，如果不存在元素element，则返回-1
     *
     * @param element
     * @return
     */
    public int find(int element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除索引index位置的元素，并将删除的元素返回
     *
     * @param index
     * @return
     */
    public int remove(int index) {
        // 简单判断数组索引的合法性
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("删除数组元素失败，索引不合法");
        }
        // 存放删除指定索引的位置元素
        int result = data[index];
        // 从删除指定索引的后一个位置，一直往前挪一位，直到最后一个元素
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        // 维护size的位置
        size--;
        return result;
    }

    /**
     * 删除数组中第一个元素，并将删除的元素进行返回
     *
     * @return
     */
    public int removeFirst() {
        return remove(0);
    }

    /**
     * 删除数组中最后一个元素，并将删除的元素进行返回
     *
     * @return
     */
    public int removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size + ",capacity=" + data.length +
                '}';
    }
}
