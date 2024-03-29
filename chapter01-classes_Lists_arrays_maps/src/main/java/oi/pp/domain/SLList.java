package oi.pp.domain;

/**
 * Non-Naked Recursive Data StructureList
 * Single Linked List：单向链表
 * @author supanpan
 * @date 2024/02/04
 */
public class SLList {
    /* 定义一个内部类，用于存储数据（仅仅被SLList使用，因为没有其他人对IntNode进行引用） */
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* 将first设为private，不向外暴露（访问控制，access control） */
    // private IntNode first;
    // 使用哨兵节点sentinel来代替first
    private IntNode sentinel;
    // 链表的长度，缓存的方式
    private int size;

    public SLList() {
        sentinel = new IntNode(42, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(42, null);
        sentinel.next = new IntNode(x, null);
        size = 1;// 链表初始化的时候长度为1
    }

    public void addFirst(int x) {
        //  new IntNode(x, first) => 表示x是新的头节点，first作为x值的后续元素
        // first = new IntNode(x, first);
        sentinel.next = new IntNode(x, sentinel.next);
        // 当链表中的元素个数增加时，size也要增加1
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    /**
     * 添加元素到链表的末尾
     *
     * @param x
     */
    public void addLast(int x) {
        // 当链表中的元素个数增加时，size也要增加1
        size += 1;
        // 修复空链表的bug
//        if (first == null) {
//            first = new IntNode(x, null);
//            return;
//        }
        // 获取到头节点
        IntNode p = sentinel;
        // 循环遍历链表，直到p.next为null循环到链表的最后一个节点
        while (p.next != null) {
            p = p.next;
        }
        // 将新的元素插入到链表的最后一个节点
        p.next = new IntNode(x, null);

    }

    /**
     * 递归方式实现获取链表的长度
     *
     * @param p
     * @return
     */
    private static int sizeRecursion(IntNode p) {
        // 递归结束条件
        if (p.next == null) {
            return 1;
        }
        // 递归调用
        return 1 + sizeRecursion(p.next);
    }

    public int size() {
        // 传入链表的头节点，计算链表的长度
//        return sizeRecursion(first);// 递归形式
        // 使用缓存的形式
        return size;
    }

    /**
     * 使用迭代方式实现获取链表的长度
     *
     * @return 链表的长度
     */
    public int sizeIteration() {
        IntNode p = sentinel;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.next;
        }
        return size;
    }
    public int remove(int i){
        IntNode p = sentinel;
        while (p != null){
            if(p.next.item == i){
                p.next = p.next.next;
                return i;
            }
            p = p.next;
        }
        return -1;
    }

    public void insert(int item, int position){
        IntNode p = sentinel;
        while (position > 0){
            p = p.next;
            position -= 1;
        }
        IntNode newNode = new IntNode(item, p.next);
        p.next = newNode;
    }

    /**
     * 打印链表
     */
    public void print() {
        IntNode p = sentinel;
        while (p != null) {
            System.out.print(p.item + "=>");
            p = p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // 创建一个SLList，值为15
//        SLList L = new SLList(15);
        // 创建一个空的SLList
        SLList L = new SLList();
        // 添加一个值为10的元素
        L.addFirst(10);
        L.addFirst(100);
        L.addLast(25);
        L.addLast(205);
        L.print();
        System.out.println("L.size() = " + L.size());

    }
}
