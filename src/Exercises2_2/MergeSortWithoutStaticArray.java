package Exercises2_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class MergeSortWithoutStaticArray {
    public static Comparable[] sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a,0,a.length-1, aux);
        return aux;
    }
    public static void sort(Comparable[] a, int lo, int hi, Comparable[] aux) {
        //Сортировка a[lo...hi].
        if (hi<=lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a,lo,mid,aux);
        sort(a,mid+1,hi,aux);
        merge(a,lo,mid,hi,aux);
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi, Comparable[] aux) {
        //Слияние a[lo...mid], a[mid+1...hi].
        int i = lo, j = mid+1;
        for (int k = lo; k<=hi;k++)
            aux[k] = a[k];
        for (int k = lo; k<=hi;k++)
            if (i > mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (less(aux[j],aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
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
