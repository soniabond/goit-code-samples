package module3.lesson1;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        String [] usernames = new String [3]; // numbers starts from 0
        usernames[0] = "ivan@gmail.com";
        usernames[2] = "daryna@gmail.com";

        System.out.println("Arrays.toString(usernames) = " + Arrays.toString(usernames));

        usernames[1] = "newmaiul@gmail.com";

        System.out.println("Arrays.toString(usernames) = " + Arrays.toString(usernames));

        int [] arrInt = new int [10];
        System.out.println("arrInt = " + Arrays.toString(arrInt));

        String [] cardTypes = {"regular", "gold", "black"};
        System.out.println("cardTypes = " + Arrays.toString(cardTypes));
        cardTypes[0] = "platinum";
        System.out.println("cardTypes = " + Arrays.toString(cardTypes));
        System.out.println("cardTypes.length = " + cardTypes.length);
        System.out.println("last elem = " + cardTypes[cardTypes.length - 1]);

//        int[][] sudoku = new int [10][11];
//        sudoku[1][2] = 1;

        int[][] sudoku = {
                {1, 2, 3},
                {9, 0, 7},
                {5, 4, 5}
        };
    }
}
