package oi.pp.domain;

/**
 * Non-Naked Recursive Data StructureList
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
    private IntNode first;

    public SLList(int x) {
       first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }
    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        // 创建一个SLList，值为15
        SLList L = new SLList(15);
        // 添加一个值为10的元素
        L.addFirst(10);

        System.out.println("L.first.item = " + L.first.item);
        System.out.println("L.first.next.item = " + L.first.next.item);
    }
}
