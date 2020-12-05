package com.github.yb.section1_5;

import java.util.List;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -987, 5623, 463, -9, 287, 49};

        sort(nums);
    }

    public static void sort(int[] nums) {
        int a, b, t;
        int size;
        size = nums.length;

        System.out.println("Исходный массив: ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }

        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();
    }


}
