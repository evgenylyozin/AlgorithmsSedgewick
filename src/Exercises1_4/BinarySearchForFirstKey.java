package Exercises1_4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearchForFirstKey {

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        int resultMid = -1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else {
                resultMid = mid;
                hi = mid - 1;
            }
        }
        return resultMid;
    }

    public static void main(String[] args) {

        In in = new In(args[0]);
        int[] checklist = in.readAllInts();

        // sort the array
        Arrays.sort(checklist);

        System.out.println(indexOf(checklist,2));
    }
}
