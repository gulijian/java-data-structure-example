package com.gulj.data.structure.queue.example;

import com.gulj.data.structure.queue.example.impl.DynamicArrayQueue;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 数组队列测试类
 * @author: gulj
 * @create: 2019/3/14 3:16 AM
 **/
public class DynamicArrayQueueTest {
    @Test
    public void testArrayQueue() {
        // 指定容量（capacity=6）初始化队列
        DynamicArrayQueue<String> dynamicArrayQueue = new DynamicArrayQueue(3);
        System.out.println("初始队列：" + dynamicArrayQueue);

        // 准备入队元素
        List<String> enQueueElements = Arrays.asList("A", "B", "C");

        // 元素入队
        enQueueElements.forEach(x -> dynamicArrayQueue.enqueue(x));
        System.out.println("元素A、B、C入队：" + dynamicArrayQueue);

        // 此时如果又有一个元素D入队，会发生扩容操作 （size == capacity  ）进行缩容
        dynamicArrayQueue.enqueue("D");
        System.out.println("元素D入队，发生扩容：" + dynamicArrayQueue);


        // 元素A出队，会发生缩容操作（size == capacity /2 ）
        dynamicArrayQueue.dequeue();
        System.out.println("元素A出队，发生缩容：" + dynamicArrayQueue);

        // 元素B出队
        dynamicArrayQueue.dequeue();
        System.out.println("元素B出队：" + dynamicArrayQueue);

    }
}
