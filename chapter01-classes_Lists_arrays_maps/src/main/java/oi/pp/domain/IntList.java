package oi.pp.domain;

/**
 * 测试链表IntList
 * @author supanpan
 * @date 2024/02/04
 */
public class IntList {
    public int first;
    public IntList rest;

    public IntList() {
    }

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     * 递归计算链表长度
     * @return 链表长度
     */
    public int size(){
        // 第一步：编写递归的基本情况
        if(rest == null){
            return 1;
        }
        // 执行递归代码
        return 1 + this.rest.size();
    }
    /**
     * 迭代计算链表长度
     * @return 链表长度
     */
    public int iterativeSize(){
        IntList p = this;
        int size = 0;
        while(p != null){
            size += 1;
            p = p.rest;
        }
        return size;
    }

    /**
     * 获取链表中的第i个元素
     * 递归的方式
     * @param i
     * @return
     */
    public int get(int i){
        if(i == 0){// 当下标为0时，返回第一个元素
            return first;
        }
        return rest.get(i - 1);
    }
    public int getIterative(int i){
        IntList p = this;
        // 当前元素的索引
        int size = 0;
        while(p != null){
            size += 1;
            if(size == i){
                // 如果当前元素的索引等于i，返回当前元素的值是第i个元素，返回该元素
                return p.first;
            }
            p = p.rest;
        }
        return 0;
    }

    public static void main(String[] args) {
        // 传统写法
//        IntList L = new IntList();
//        L.first = 5;
//        L.rest = null;
//
//        L.rest = new IntList();
//        L.rest.first = 10;
//        L.rest.rest = null;

        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        System.out.println("L.size => " + L.size());
        // System.out.println(L.rest.rest.first);

        while (L != null) {
            System.out.println(L.first + " size => " + L.size());
            L = L.rest;
        }
        System.out.println("===========");
        // 或者反向初始化，当前值的next节点传入旧链表
        IntList L2 = new IntList(15, null);
        L2  = new IntList(10, L2);
        L2  = new IntList(5, L2);
        while (L2 != null) {
            System.out.println(L2.first + " size => " + L2.size());
            L2 = L2.rest;
        }
    }
}
