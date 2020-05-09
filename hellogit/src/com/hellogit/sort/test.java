package com.hellogit.sort;

/*
 for some classic sort algorithm
 */
public class SortClass {
    private final static int[] unSortedArr = {3,7,1,10,5,2,16,2};
    private final static SortClass sc = new SortClass();
    public static void main(String[] args) {

//        int[] arr = sc.bubbleSorted(unSortedArr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        int[] arr = sc.insertionSorted(unSortedArr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    //冒泡排序
    public int[] bubbleSorted(int[] arr) {
        if (arr.length == 0) return arr;
        for (int i = 0; i < arr.length; i++) {
            //swap flag
            boolean isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    isSwap = true;
                }
            }
            if(!isSwap) break;

        }
        return arr;
    }

    //选择排序 不稳定 exp:2621
    public int[] selectionSorted(int[] arr) {
        if(arr.length == 0) return arr;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    //插入排序
    public int[] insertionSorted(int[] arr) {
        int current;
        //假设第一位是有序区
        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            int preIndex = i - 1;
            while(preIndex >= 0 && current < arr[preIndex] ) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;

        }
        return arr;
    }
}
