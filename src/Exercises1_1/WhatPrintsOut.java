package Exercises1_1;

public class WhatPrintsOut {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }

        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t+t)/2.0;
        System.out.printf("%.5f\n",t);

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 1; i < 1000; i*=2)
            for (int j = 0; j < i; j++)
                sum2++;
        System.out.println(sum2);

        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char) ('a'+4));

        int[] check = new int[10];

        for (int i = 0; i < 10; i++)
            check[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            System.out.println(check[i]);
        for (int i = 0; i < 10; i++)
            check[i] = check[check[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        for (int i = 0; i < 10; i++)
            System.out.println(check[i]);

    }
}
