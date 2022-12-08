package cn.qsh.sorts;

import java.util.Arrays;

/**
 * <p>
 * 冒泡排序
 *
 * @author: mini
 * @Date: 2022-12-08 13:37
 * @Description: 冒泡排序
 */

public class BubbleSort implements IArraySort {
    //冒泡排序
    @Override
    public int[] sort(int[] sourceArray) {

        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序
            boolean flag = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }

        return arr;
    }
}
