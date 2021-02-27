package AlgorithmsSedgewick;

import Exercises2_2.MergeSortWithoutStaticArray;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if(alg.equals("SelectionSort")) SelectionSort.sort(a);
        if(alg.equals("InsertionSort")) InsertionSort.sort(a);
        if(alg.equals("ShellSort")) ShellSort.sort(a);
        if(alg.equals("MergeSort")) MergeSortWithoutStaticArray.sort(a);
        return timer.elapsedTime();
    }
    public static double timeRandomInput(String alg, int N, int T) {
        //alg указывает алгоритм сортировки T случайных массивов размером N
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            // Выполнение одного эксперимента (генерация и сортировка массива).
            for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform();
            total += time(alg,a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1,N,T);//общее время для alg1
        double t2 = timeRandomInput(alg2,N,T);//общее время для alg2
        StdOut.printf("Для %d случайных Doubles\n   %s в", N, alg1);
        StdOut.printf(" %.1f раз быстрее, чем %s\n", t2/t1, alg2);
    }
}
