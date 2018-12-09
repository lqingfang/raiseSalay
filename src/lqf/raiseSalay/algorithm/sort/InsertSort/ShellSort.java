package lqf.raiseSalay.algorithm.sort.InsertSort;

import lqf.raiseSalay.algorithm.sort.PrintArray;

public class ShellSort {
    private static PrintArray p = new PrintArray();
    public static void main(String[] args) {
        int a[] = {51,49,46,7,15,36,17,35,90,22,4,6};
        sort(a);
    }
    public static void sort(int[] a){
        int length = a.length;
        int m,temp,d,j;
        for (d=length/2;d>0;d=d/2) {
            for(m=0;m<d;m++) {
                for(int i=d+m;i<length;i=i+d){
                    temp = a[i];
                    for (j=i-d;j>=0 && a[j]>temp;j=j-d) {
                        a[j+d]=a[j];
                    }
                    a[j+d]=temp;
                }
            }
        }
        p.printArray(a);
    }
}
