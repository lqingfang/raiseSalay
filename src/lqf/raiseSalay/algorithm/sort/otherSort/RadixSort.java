package lqf.raiseSalay.algorithm.sort.otherSort;
import lqf.raiseSalay.algorithm.sort.PrintArray;
//https://www.cnblogs.com/developerY/p/3172379.html
public class RadixSort {
    private static PrintArray p = new PrintArray();
    public static void main(String[] args) {
        int a[] = {51,49,46,7,15,36,17,35,90,22,4,6};
        sort(a,100);
        p.printArray(a);
    }
    private static void sort(int[] array,int d)
    {
        int length = array.length;
        int n = 1;
        int k = 0;
        int[][] bucket = new int[10][length];
        int[] order = new int[length];
        while (n<d) {
            for (int i=0;i<length;i++) {
                int digit = (array[i]/n)%10;
                bucket[digit][order[digit]] = array[i];
                order[digit]++;
            }
            for (int m=0;m<10;m++) {
                if(order[m]>0) {
                    for(int j=0;j<order[m];j++) {
                        array[k++] = bucket[m][j];
                    }
                }
                order[m] = 0;
            }
            n*=10;
            k=0;
        }

    }

}
