//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void pintarBarcoHorizontal(char [][] tablero, int fila, int columna, int longitud) {
        // Validamos que los indices no sobrepasen los limites del tablero
        if(fila > tablero.length || columna > tablero[0].length || longitud + columna > tablero[0].length) {
            System.out.println("Indice inválido...");
        }
        else {
            for(int i = 0; i < longitud; i++)  {
                if(tablero[fila][columna + i] == '.') {
                    tablero[fila][columna + i] = 'B';
                } else {
                    System.out.println("Movimiento invalido...");
                    break;
                }
            }
        }
    }

 /*   public static  void pintarBarcosHorizontal(char [] [] tablero, int fila, int columna, int longitud){
        //
        if (fila + longitud > tablero.length){
            System.out.println("Desbordo...");
        }else if (fila > tablero.length){
            System.out.println("Coordenada invalida");
        }else if(columna > tablero[0].length){
            System.out.println("odio las matrices :(");
        }else if (fila < 0){
            System.out.println("Coordenada invalida ");
        }else if(columna < 0){
            System.out.println("Coordenada invalida ");
        }else {

        }*/
    public static  void pintarBarcoVertical(char [] [] tablero, int fila, int columna, int longitud){
        //
     if (fila + longitud > tablero.length){
         System.out.println("Desbordo...");
     }else if (fila > tablero.length){
         System.out.println("Coordenada invalida");
     }else if(columna > tablero[0].length){
         System.out.println("odio las matrices :(");
     }else if (fila < 0){
         System.out.println("Coordenada invalida ");
     }else if(columna < 0){
         System.out.println("Coordenada invalida ");
     }else {
         for (int i = 0; i < longitud; i++){
             if(tablero [fila + i] [columna] == '.'){
                tablero [fila + i ][columna]= 'B';
            }else {
                 System.out.println("Error");
                    break;
            }
         }
     }
    }
    public static void main(String[] args) {

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

        //3)Imprime el tablero
        for(int i = 0; i < tablero.length; i++){
            System.out.println();
            for (int y = 0; y < tablero[i].length; y++){
                System.out.print(tablero[i][y]+" ");
            }
        }

        System.out.println("\nTablero con barcos:");

        pintarBarcoHorizontal(tablero, 0, 3, 3);
        pintarBarcoHorizontal(tablero,4,1,2);
        pintarBarcoVertical(tablero,2,4,4);

        for(int i = 0; i < tablero.length; i++){
            System.out.println();
            for (int y = 0; y < tablero[i].length; y++){
                System.out.print(tablero[i][y]+" ");
            }
        }



    }
}


//)Pintar barcos

// 7)printar barcos y cordenadas