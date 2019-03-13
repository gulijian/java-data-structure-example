package com.gulj.data.structure.queue.example;

/**
 * 队列接口定义
 *
 * @param <E>
 */
public interface Queue<E> {
    /**
     * 入队
     *
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     *
     * @return
     */
    E dequeue();

    /**
     * 获取队首元素
     *
     * @return
     */
    E getFront();

    /**
     * 获取队列中元素的个数
     *
     * @return
     */
    int getSize();

    /**
     * 判断队列是否为空
     *
     * @return
     */
    boolean isEmpty();
}
