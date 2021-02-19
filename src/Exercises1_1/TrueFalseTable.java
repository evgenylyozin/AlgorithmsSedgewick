package Exercises1_1;

public class TrueFalseTable {
    public static void main(String[] args) {
        boolean[][] array;
        array = new boolean[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = true;
            }
        }
        PrintArray(array);


    }

    public static void PrintArray(boolean[][] array) {
        System.out.print("  1234\n");
        for (int i = 0; i < 4; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < 4; j++) {
                if (array[i][j] == true) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j == 3)
                    System.out.print("\n");
            }
        }
    }
}
