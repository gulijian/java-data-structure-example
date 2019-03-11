package com.gulj.data.structure.stack.example;

/**
 * @description: 自定义栈接口定义
 * @author: gulj
 * @create: 2019/3/12 1:59 AM
 **/
public interface Stack<E> {

    /**
     * 向栈中添加元素
     *
     * @param e
     */
    void push(E e);

    /**
     * 从栈中删除元素
     */
    void pop();

    /**
     * 获取栈顶元素
     *
     * @return
     */
    E peek();

    /**
     * 获取栈中元素个数
     *
     * @return
     */
    int getSize();

    /**
     * 判断栈中是否为空
     *
     * @return
     */
    boolean isEmpty();

}
