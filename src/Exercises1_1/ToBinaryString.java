package Exercises1_1;

public class ToBinaryString {
    public static void main(String[] args) {
        String s = "";
        int N = 123;
        for (int n = N; n>0; n/=2) {
            s = (n%2)+s;
        }
        System.out.println(s);

    }
}
