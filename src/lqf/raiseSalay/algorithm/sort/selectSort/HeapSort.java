package lqf.raiseSalay.algorithm.sort.selectSort;

import lqf.raiseSalay.algorithm.sort.PrintArray;

import java.util.Arrays;

public class HeapSort {
    private static PrintArray p = new PrintArray();
    public static void main(String[] args) {
        int a[] = {51,49,46,7,15,36,17,35,90,22,4,6};
        int b[] = new int[a.length];
        sort(a,b);
        p.printArray(b);
    }
    private static void sort(int[] a,int[] b){
        int j=0;
        for (int i=a.length;i>0;i--) {
            //初始化堆
            buildHeap(a,i);
            //交换第0个和最后一个
            swap(a,0,i-1);
            //将最小的赋给数据b的第j个元素
            b[j++] =  a[i-1];
            //a中的元素去掉最后一个
            a = Arrays.copyOf(a, i-1);
            p.printArray(a);
        }
    }

    //初始化堆，使得第0个是最小的
    private static void buildHeap(int[] a,int size) {
        for(int i=size/2;i>=0;i--) {
            HeapAdjust(a,i,size);
        }
    }

    private static void HeapAdjust(int[] a, int i, int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;
        if(left<size && a[left] < a[min]) {
            min = left;
        }
        if(right<size && a[right] < a[min]) {
            min = right;
        }
        if(min!=i) {
            swap(a,min,i);
            HeapAdjust(a,min,size);
        }
    }

    private static void swap(int[] a,int b,int min){
        int temp = a[b];
        a[b] = a[min];
        a[min] = temp;
    }
}
