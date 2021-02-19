package Exercises1_1;

public class LG {
    public static void main(String[] args) {
        System.out.println(lg(9));
    }

    public static int lg(int N) {
        if (N < 2)
            return 0;
        return lg(N/2)+1;
    }
}
