package com.gulj.data.structure.linkedlist.example;

/**
 * @description: Java版数据结构-链表
 * @author: gulj
 * @create: 2019/3/27 9:56 PM
 **/
public class LinkedList<E> {
    /**
     * 虚拟的头结点
     */
    private Node dummyHead;
    /**
     * 链表中节点的个数
     */
    private int size;

    public LinkedList() {
        // 创建一个虚拟的头结点
        dummyHead = new Node();
    }


    /**
     * 向链表中指定位置插入节点（学习使用，真正插入不会指定索引）
     *
     * @param index 索引的位置
     * @param e     节点的元素
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("不是有效的索引");
        }

        Node prev = dummyHead;

        // 找到index位置的前一个节点
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        // 新建一个节点，进行挂接
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;

        size++;
    }


    /**
     * 向链表头添加元素
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 向链表尾部添加元素
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }


    /**
     * 获取链表中index位置的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("不是有效的索引");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }


    /**
     * 获取第一个元素
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }


    /**
     * 获取最后一个元素
     *
     * @return
     */
    public E getLast() {
        return get(size);
    }

    /**
     * 修改链表中index位置节点的元素
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("不是有效的索引");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }


    /**
     * 查找链表中是否包含元素e
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    /**
     * 删除链表中index位置的节点
     *
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("不是有效的索引");
        }

        Node prev = dummyHead;

        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
    }


    /**
     * 删除链表中第一个元素
     */
    public void removeFirst() {
        remove(0);
    }


    /**
     * 删除链表中最后一个元素
     */
    public void removeLast() {
        remove(size - 1);
    }


    // 节点类
    private class Node {
        // 存储节点的元素
        public E e;
        // 存储下一个节点的地址
        public Node next;

        public Node() {

        }

        public Node(E e) {
            this.e = e;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", next=" + next +
                    '}';
        }
    }
}
