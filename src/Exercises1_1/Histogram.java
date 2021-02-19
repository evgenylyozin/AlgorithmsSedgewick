package Exercises1_1;

public class Histogram {
    public static void main(String[] args) {

        int[] a = new int[]{0,1,2,3,4,5,6,7,7,7};
        int[] resultArray = histogram(a,10);
        for (int i = 0; i < 10; i++) {
            System.out.println(resultArray[i]);
        }
    }

    public static int[] histogram(int[] a, int M) {

        int[] resultArray = new int[M];

        for (int i = 0; i < M; i++) {
            resultArray[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    resultArray[i] += 1;
                }
            }
        }

        return resultArray;
    }
}
