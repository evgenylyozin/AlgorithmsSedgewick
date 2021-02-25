package Exercises1_4;


public class PartlyMergeSort {
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int N = a.length + b.length;
        int aPointer = 0;
        int bPointer = 0;
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            if (aPointer == a.length) {
                result[i] = b[bPointer];
                bPointer++;
            } else if (bPointer == b.length) {
                result[i] = a[aPointer];
                aPointer++;
            } else {
                if (a[aPointer] < b[bPointer]) {
                    result[i] = a[aPointer];
                    aPointer++;
                } else {
                    result[i] = b[bPointer];
                    bPointer++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,4,5,6,11,12,13,14,15};
        int[] b = new int[]{2,3,7,8,9,10};
        int[] result = mergeSortedArrays(a,b);
        for (int i = 0; i < 15; i++) {
            System.out.println(result[i]);
        }
    }
}
