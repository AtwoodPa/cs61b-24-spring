package oi.pp.test;

import oi.pp.domain.Walrus;

/**
 * 海象之谜
 * 值传递和引用传递测试
 *
 * @author supanpan
 * @date 2024/02/04
 */
public class WalrusTest {
    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;

        b = a;
        b.weight = 5;

        System.out.println(a.weight);
        System.out.println(b.weight);

        int x = 5;
        int y;
        y = x;
        x = 2;
        System.out.println(x);
        System.out.println(y);
    }
}
