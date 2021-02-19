package Exercises1_1;

public class Transposition {
    public static void main(String[] args) {
        int[][] array;
        int[][] resultArray;

        array = new int[4][4];
        resultArray = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (i+j)*i;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                resultArray[i][j] = 0;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]);
                if (j == 3) {
                    System.out.print("\n");
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                resultArray[i][j] = array[j][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(resultArray[i][j]);
                if (j == 3) {
                    System.out.print("\n");
                }
            }
        }
    }
}
