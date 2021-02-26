package AlgorithmsSedgewick;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class MergeSort {
    public static void sort(Comparable[] a) {

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
