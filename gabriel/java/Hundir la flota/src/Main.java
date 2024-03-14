//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int ejemplo = 7;
        //lista = new int [6];
        // 1)Darle valores [ | | | | | ]
        int [] lista= {0,0,1,0,0,0};
        char [][] tablero = {{'.','.','.','.','.','.'}
                            ,{'.','.','.','.','.','.'}
                            ,{'.','.','.','.','.','.'}
                            ,{'.','.','.','.','.','.'}
                            ,{'.','.','.','.','.','.'}
                            ,{'.','.','.','.','.','.'}};
        // 2)Imprimir valores
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista [i]+" ");
        }
        for(int i = 0; i < tablero.length; i++){
            System.out.println();
            for (int y = 0; y < tablero[i].length; y++){
                System.out.print(tablero[i][y]+" ");
            }
        }
    //Pintar barcos 
        // 3)declarar tablero

        // 4)darle valores al tablero
        // 5)imprimirlo
        // 6)printar barcos y cordenadas
    }
}