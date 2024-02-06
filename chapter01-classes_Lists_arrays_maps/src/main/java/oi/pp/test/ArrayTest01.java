package oi.pp.test;

/**
 * @author supanpan
 * @date 2024/02/06
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        // int[] x = new int[3];
        // int[] y = new int[]{1, 2, 3, 4, 5};
        // int[] z = {9, 10, 11, 12, 13};
        int[] z = null;
        int[] x, y;
        x = new int[]{1, 2, 3, 4, 5};
        y = x;
        x = new int[]{-1, 2, 5, 4, 99};
        y = new int[3];
        z = new int[0];// 这是个空的数组，啥也没有（包括框框也没有）
        int xL = x.length;

        String[] s = new String[6];// 创建一个长度为6的字符串数组，默认值为null（字符串引用）
        s[4] = "ketchup";// 字符引用指向ketchup字符串
        s[x[3] - x[1]] = "muffins";// 字符引用指向muffins字符串

        int[] b = {9, 10, 11, 12, 13};
        System.arraycopy(b, 0, x, 3, 2);
    }
}
