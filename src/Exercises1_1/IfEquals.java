package Exercises1_1;

public class IfEquals {
    public static void main(String[] args) {
        System.out.println(
                ifEquals(
                        Integer.parseInt(args[0]),
                        Integer.parseInt(args[1]),
                        Integer.parseInt(args[2])
                )
        );
    }

    public static String ifEquals (int a, int b, int c) {
        if (a == b && b == c) {
            return "равны";
        }
        return "не равны";
    }
}
