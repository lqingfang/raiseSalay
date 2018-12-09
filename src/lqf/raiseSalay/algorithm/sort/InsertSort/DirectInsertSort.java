package lqf.raiseSalay.algorithm.sort.InsertSort;

import lqf.raiseSalay.algorithm.sort.PrintArray;

public class DirectInsertSort {
    private static PrintArray p = new PrintArray();
    public static void main(String[] args) {
        int a[] = {2,1,6,5,9,4,3};
        directSort(a);
    }
    private static void directSort(int[] a){
        int length = a.length;
        for(int i=1;i<length;i++){
            int temp = a[i];
            int j;
            for(j=i-1;j>=0 && a[j]>temp;j--) {
                a[j+1] = a[j];
            }
            a[j+1] = temp;
            p.printArray(a);
            System.out.println();
        }
    }
}
