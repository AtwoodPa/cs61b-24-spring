package oi.pp.domain;

/**
 * 双重链表 - Generic Double Linked List
 *
 * @author supanpan
 * @date 2024/02/06
 */
public class DLList<T> {
    private IntNode sentinel;
    private int size;
    public static class IntNode<T> {
        public IntNode prev;
        public T item;
        public IntNode next;
        public IntNode() {

        }
        public IntNode(T x, IntNode n) {
            item = x;
            next = n;
        }
    }

    public DLList(T x) {
        sentinel = new IntNode(42, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /**
     * 创建一个空的链表
     */
    public DLList() {
        sentinel = new IntNode(42, null);
        size = 0;
    }

    /**
     * 添加元素至链表尾部
     * @param x
     */
    public void addLast(T x){
        sentinel.next = new IntNode(x, sentinel.next);
        size = size + 1;
    }

    public static void main(String[] args) {
        DLList<String> d2 = new DLList<>("hello");
        d2.addLast("world");
        System.out.println(d2.sentinel.item);
        System.out.println(d2.sentinel.next.item);
    }
}
