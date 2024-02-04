package oi.pp.domain;

/**
 * Non-Naked Recursive Data StructureList
 * @author supanpan
 * @date 2024/02/04
 */
public class SLList {

    public IntNode first;

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
