package Exercises1_1;

public class BetweenZeroAndOne {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        if (0 < x && 0 < y && 1 > x && 1 > y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
