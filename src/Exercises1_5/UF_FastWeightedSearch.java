package Exercises1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF_FastWeightedSearch {
    private int[] sz;
    private int[] id;
    private int count;

    public UF_FastWeightedSearch(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        sz = new int[n];
        for (int i = 0; i < n; i++) sz[i] = 1;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p,int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) return;

        if (sz[pID] < sz[qID]) {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == pID) id[i] = qID;
            }
            sz[pID] += sz[qID];
        }
        else {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == qID) id[i] = pID;
            }
            sz[qID] += sz[pID];
        }

        count--;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        UF_FastWeightedSearch uf = new UF_FastWeightedSearch(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.find(p) == uf.find(q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
