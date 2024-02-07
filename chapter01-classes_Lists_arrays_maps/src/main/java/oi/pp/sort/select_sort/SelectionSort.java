package oi.pp.sort.select_sort;

/**
 * @author supanpan
 * @date 2024/02/07
 */
public class SelectionSort {

    public static void sort(String[] x){
        sort(x,0);
    }

    private static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }
        int smallestIndex = findSmallest(x);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }
    public static void swap(String[] x, int a, int b) {
        // 通过临时变量进行暂存
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    public static int findSmallest(String[] x){
        int smallestIndex = 0;
        for (int i = 0; i < x.length; i += 1){
            if (x[i].compareTo(x[smallestIndex]) < 0){
                smallestIndex = i;
            }
        }
        // 返回最小值的索引
        return smallestIndex;
    }
}
