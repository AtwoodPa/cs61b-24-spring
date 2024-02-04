package oi.pp.domain;

/**
 * @author supanpan
 * @date 2024/02/04
 */
public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }
}
