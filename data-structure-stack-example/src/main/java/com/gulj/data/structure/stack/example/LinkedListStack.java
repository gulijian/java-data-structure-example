package com.gulj.data.structure.stack.example;

import java.util.LinkedList;

/**
 * @description: 使用LinkedList集合类，实现栈
 * @author: gulj
 * @create: 2019/3/12 1:57 AM
 **/
public class LinkedListStack<E> implements Stack<E> {

    /**
     * 存放栈元素
     */
    LinkedList<E> list;

    /**
     * 构造栈结构
     */
    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addLast(e);
    }

    @Override
    public void pop() {
        list.removeLast();
    }

    @Override
    public E peek() {
        return list.getLast();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "list=" + list +
                '}';
    }
}
