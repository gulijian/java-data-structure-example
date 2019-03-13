package com.gulj.data.structure.queue.example.impl;

import com.gulj.data.structure.array.example.type.DynamicArray;
import com.gulj.data.structure.queue.example.Queue;

/**
 * @description: 数组队列（基于我们之前写的动态数组实现）
 * @author: gulj
 * @create: 2019/3/13 1:29 AM
 **/
public class DynamicArrayQueue<E> implements Queue<E> {

    /**
     * 用数组存放队列中元素的个数
     */
    private DynamicArray<E> dynamicArray;

    /**
     * 指定容量，初始化队列
     *
     * @param capacity
     */
    public DynamicArrayQueue(int capacity) {
        dynamicArray = new DynamicArray<>(capacity);
    }

    /**
     * 默认容量，初始化队列
     */
    public DynamicArrayQueue() {
        dynamicArray = new DynamicArray<>();
    }


    @Override
    public void enqueue(E e) {
        dynamicArray.addLast(e);
    }

    @Override
    public E dequeue() {
        return dynamicArray.removeFirst();
    }

    @Override
    public E getFront() {
        return dynamicArray.getFirst();
    }

    @Override
    public int getSize() {
        return dynamicArray.getSize();
    }

    @Override
    public boolean isEmpty() {
        return dynamicArray.isEmpty();
    }

    @Override
    public String toString() {
        return "DynamicArrayQueue{" +
                "【队首】dynamicArray=" + dynamicArray + "}【队尾】";
    }
}
