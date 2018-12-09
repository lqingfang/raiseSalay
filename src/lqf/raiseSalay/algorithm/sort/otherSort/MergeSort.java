package lqf.raiseSalay.algorithm.sort.otherSort;
import lqf.raiseSalay.algorithm.sort.PrintArray;

public class MergeSort {
    private static PrintArray p = new PrintArray();
    public static void main(String[] args) {
        int a[] = {51,49,46,7,15,36,17,35,90,22,4,6};
        int[] b = sort(a);
        p.printArray(b);
    }
    public static int[] sort(int[] a){
        if(a.length<2) return a;
        int mid = a.length/2;
        int[] m = new int[mid];
        int[] n = new int[a.length-mid];
        for(int i=0;i<a.length;i++) {
            if(i<mid) m[i] = a[i];
            else n[i-mid] = a[i];
        }
        m = sort(m);
        n = sort(n);
        return merge(m,n);
    }
    public static int[] merge(int[] a,int[] b){
        int[] arr = new int[a.length+b.length];
        int ai=0;
        int bi=0;
        for(int i=0;i<arr.length;i++) {
            //就分这两种情况
            if(bi == b.length ||(ai<a.length && a[ai]<=b[bi])) {
                arr[i] = a[ai];
                ai++;
            } else{
                arr[i] = b[bi];
                bi++;
            }
        }
        return arr;
    }
}
