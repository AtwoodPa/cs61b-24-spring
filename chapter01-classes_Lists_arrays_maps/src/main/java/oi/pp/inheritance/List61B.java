package oi.pp.inheritance;

/**
 * 链表接口 - 定义链表的基本操作（规范）
 * 实现该接口的子类 => 支持向上转型
 * @author supanpan
 * @date 2024/02/07
 */
public interface List61B<Item> {
    public void insert(Item x, int position);
    public void addFirst(Item x);
    public void addLast(Item x);
    public Item getFirst();
    public Item getLast();
    public Item get(int i);
    public int size();
    public Item removeLast();
    default public void print() {
        for (int i = 0; i < size(); i += 1) {
            System.out.print(get(i) + " ");
        }
    }
}
