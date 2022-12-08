package cn.qsh.sorts;

import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * <p>
 * 测试
 *
 * @author: mini
 * @Date: 2022-12-08 13:49
 * @Description: 测试
 */

public class Test {


    @org.junit.Test
    public void test_Bubble() {
        int[] numberArr = {5, 1, 4, 7, 9};
        int[] numberArr1 = {1, 4, 5, 7, 9};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sort = bubbleSort.sort(numberArr);
        Assert.assertArrayEquals(sort, numberArr1);
        System.out.println("冒泡排序："+ Arrays.toString(sort));


    }


    @org.junit.Test
    public void test1_Selection() {
        int[] numberArr = {5, 1, 4, 7, 9};
        int[] numberArr1 = {1, 4, 5, 7, 9};
        SelectionSort selectionSort = new SelectionSort();
        int[] sort = selectionSort.sort(numberArr);
        Assert.assertArrayEquals(sort, numberArr1);
        System.out.println("选择排序："+ Arrays.toString(sort));


    }



    @org.junit.Test
    public void test1_Insert() {
        int[] numberArr = {5, 1, 4, 7, 9};
        int[] numberArr1 = {1, 4, 5, 7, 9};
        InsertSort insertSort = new InsertSort();
        int[] sort = insertSort.sort(numberArr);
        Assert.assertArrayEquals(sort, numberArr1);
        System.out.println("插入排序："+ Arrays.toString(sort));


    }

}
