package Exercises2_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ShellSortWithStepArray {
    public static void sort(Comparable[] a) {
        int n = a.length;
        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ...
        int h = 1;
        int countSteps = 0;
        while (h < n/3) {
            h = 3*h + 1;
            countSteps++;
        }
        int[] steps = new int[countSteps];
        countSteps = 0;
        while (h >= 1) {
            steps[countSteps] = h;
            countSteps++;
            h /= 3;
        }
        for (int step : steps) {
            // step-sort the array
            for (int i = step; i < n; i++) {
                for (int j = i; j >= step && less(a[j], a[j-step]); j -= step) {
                    exch(a, j, j-step);
                }
            }
        }
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a) {
        //Вывод массива в 1 строке.
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i]+" ");
        StdOut.println();
    }
    private static boolean isSorted(Comparable[] a) {
        //Проверка упорядоченности элементов массива.
        for (int i = 1; i < a.length; i++)
            if (less(a[i],a[i-1])) return false;
        return true;
    }

    public static void main(String[] args) {
        //Чтение строк из стандартного ввода, их сортировка и вывод.
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}

