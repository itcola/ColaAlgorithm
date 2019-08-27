package com.cola.二分查找;

public class BinarySearch {
    public int binarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > k) {
                r = mid - 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] arr = {1, 4, 5, 7, 8, 9};
        int index = bs.binarySearch(arr, 5);
        if (index == -1) {
            System.out.println("没有找到该元素");
        } else {
            System.out.println("该元素的索引位置" + index);
        }


    }
}
