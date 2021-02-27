package AlgorithmsSedgewick;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Quick3way {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo) return;
        int lt = lo, i = lo+1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a,lt++, i++);
            else if (cmp > 0) exch(a,i,gt--);
            else i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);

    }
    private static int partition(Comparable[] a, int lo, int hi) {
        //Разбиение на a[lo..i-1], a[i], a[i+1..hi].
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while (true) {
            //Просмотр справа, слева, проверка на завершение и обмен.
            while (less(a[++i],v)) if(i == hi) break;
            while (less(v,a[--j])) if(j == lo) break;
            if (i >= j) break;
            exch(a,i,j);
        }
        exch(a,lo,j); // Перемещение v = a[j] на свое место
        return j;
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
