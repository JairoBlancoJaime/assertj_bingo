package org.iesvdm;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static java.util.Arrays.deepEquals;

public class BingoTest {
    @Test
    public void rellenarNumerosCartonTest() {
        int[][] arrayBi = new int[3][6];
        Bingo.rellenarNumerosCarton(arrayBi);

        int[][] expected = {
                {1, 2, 4, 5, 6, 8},
                {10, 11, 12, 13, 16, 17},
                {23, 25, 26, 27, 28, 29},
        };

        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.print(arrayBi[i][j] + "\t");
            }
            System.out.println();
        }
        boolean compareArrays = Arrays.deepEquals(expected, arrayBi);
        System.out.println(compareArrays);

    }

    public void ponerBlancosTest() {
        int [][] arrayBi = new int[3][6];
        Bingo.ponerBlancos(arrayBi);
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.print(arrayBi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
