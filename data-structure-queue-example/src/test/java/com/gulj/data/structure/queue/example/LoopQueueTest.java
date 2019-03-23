package com.gulj.data.structure.queue.example;

import com.gulj.data.structure.queue.example.impl.LoopQueue;
import org.junit.Test;

/**
 * @description: 循环队列测试
 * @author: gulj
 * @create: 2019/3/23 1:23 PM
 **/
public class LoopQueueTest {
    @Test
    public void testLoopQueue() {
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            loopQueue.enqueue(i);
        }
        // 初始化队列数据
        System.out.println("原始队列: " + loopQueue);
        // 元素0出队
        loopQueue.dequeue();
        System.out.println("元素0出队: " + loopQueue);
        loopQueue.dequeue();
        System.out.println("元素1出队: " + loopQueue);
        loopQueue.dequeue();
        System.out.println("元素2出队: " + loopQueue);
        loopQueue.dequeue();
        System.out.println("元素3出队: " + loopQueue);
        loopQueue.dequeue();
        System.out.println("元素4出队,发生缩容: " + loopQueue);
        // 队首元素
        System.out.println("队首元素：" + loopQueue.getFront());
    }
}
