package com.gulj.data.structure.stack.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @description: T使用LinkedList集合类，实现栈测试类
 * @author: gulj
 * @create: 2019/3/12 2:11 AM
 **/
public class LinkedListStackTest {

    @Test
    public void testLinkedListStack() {
        // 栈
        Stack<String> stack = new LinkedListStack<>();
        // 准备入栈元素
        List<String> prepareElements = Arrays.asList("A", "B", "C", "D", "E");
        // 入栈
        prepareElements.forEach(x -> {
            stack.push(x);
            System.out.println("入栈操作：" + stack);
        });
        // 出栈
        stack.pop();
        System.out.println("出栈操作：" + stack);
        // 获取栈顶元素
        String peekElement = stack.peek();
        System.out.println("栈顶元素：" + peekElement);
        // 获取栈中元素的个数
        int stackSize = stack.getSize();
        System.out.println("栈中元素个数：" + stackSize);
    }

}
