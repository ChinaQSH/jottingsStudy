package cn.qsh.sorts;

import java.util.Arrays;

/**
 * <p>
 * 选择排序
 *
 * @author: mini
 * @Date: 2022-12-08 14:27
 * @Description: 选择排序
 */

public class SelectionSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }
}
