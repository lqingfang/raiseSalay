package lqf.raiseSalay.algorithm.sort.exchangeSort;

import lqf.raiseSalay.algorithm.sort.PrintArray;

public class BubbleSort {
    private static PrintArray p = new PrintArray();
    public static void main(String[] args) {
        int a[] = {51,49,46,7,15,36,17,35,90,22,4,6};
        sort(a);
    }
    public static void sort(int[] a){
        for(int i=a.length-1;i>0;i--) {
            boolean flag = false;
            for(int j=0;j<i;j++) {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
            p.printArray(a);
        }
    }
}
