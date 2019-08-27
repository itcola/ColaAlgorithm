package com.cola.选择排序;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int flag = 0;
            for (int j = i + 1; j < arr.length; j++) {
                //得到最小值
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                    flag = 1;
                }

                if (flag == 1) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for( int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int arr[] = {3,2,6,1,7,4};
        ss.selectionSort(arr);
    }
}
