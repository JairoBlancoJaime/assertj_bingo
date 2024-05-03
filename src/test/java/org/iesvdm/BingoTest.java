package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static java.util.Arrays.deepEquals;

public class BingoTest {

    //Realizamos el primer test de rellenar numeros.
    @Test
    public void rellenarNumerosCartonTest() {
        //Iniciamos una array bidimensional con las filas y las columnas.
        int[][] arrayBi = new int[3][6];
        //Traemos los valores de la clase Bingo.
        Bingo.rellenarNumerosCarton(arrayBi);

        //Creamos un array para comprobar posteriormente si son iguales.
        int[][] expected = {
                {1, 2, 4, 5, 6, 8},
                {10, 11, 12, 13, 16, 17},
                {23, 25, 26, 27, 28, 29},
        };

        //Rellenamos el array.
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.print(arrayBi[i][j] + "\t");
                /*
                Realizamos una comprobacion con assertNotEquals, para que no sea nulo.
                Si puede ser nulo, imprimiria un error.
                 */
                Assertions.assertNotEquals(0, arrayBi[i][j]);
            }
            System.out.println();
        }

        //Creamos una variable tipo boolean para verificar si cambia el arrayBi.
        boolean compareArrays = Arrays.deepEquals(expected, arrayBi);
        System.out.println(compareArrays);

    }

    public void ponerBlancosTest() {
        //Creamos un array bidimensional con las filas y las columnas.
        int [][] arrayBi = new int[3][6];
        //Traemos los valores de la clase bingo.
        Bingo.ponerBlancos(arrayBi);

        //Rellenamos el array.
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.print(arrayBi[i][j] + "\t");
            }
            System.out.println();
        }


    }

    @Test
    public void buscarFila() {
        //Creamos un array bidimensional con las filas y las columnas
        int [][] arrayBi = new int[3][6];
        //Traemos los valores de la clase bingo.
        Bingo.buscarFila(arrayBi);
    }
}
