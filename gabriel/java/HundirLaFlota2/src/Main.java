import java.util.EventListener;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
// Imprime una matriz, que recibimos como parametro  "matriz" y tiene un sout para dar los saltos de linea.
    public  static  void  imprimirMatriz(char [][] matriz){
   for (int i = 0; i < matriz.length ; i++){
       System.out.println();
       for (int y = 0; y < matriz[i].length; y++){
           System.out.print(matriz[i] [y]+" ");

            }
        }
    }

    /**
     * Pintar una "X" verificando las siguientes limitaciones
     * 1)Que la "X" no se pinete por fuera de la matriz
     * 2) Que no reciba numeros negativos
     * 3) Que verifique que donde pinta la "X" haya un "."
     * @param matriz bidimensional se asume que tiene "." en la posiciones libres
     * @param fila Representa la coordenada donde la pintar la "X"
     * @param columna Lo mismo que fila
     */
        public static void pintarX(char[][] matriz, int fila, int columna) {
            if (fila > matriz.length) {
                System.out.println("Coordenada invalida");
            } else if (columna > matriz[0].length) {
                System.out.println("Coordenada invalida");
            } else if (fila < 0) {
                System.out.println("odio las matrices :(");
            } else if (columna < 0) {
                System.out.println("Coordenada invalida ");


            } else {
                if ( matriz[fila][columna]== '.' )

                matriz[fila][columna] = 'X';
                else {
                    System.out.println("ERROR POCISION OCUPADA");
                }
            }
        }

    /**
     * Pintar una "O" verificando las siguientes limitaciones
     * 1)Que la "O" no se pinete por fuera de la matriz
     * 2) Que no reciba numeros negativos
     * 3) Que verifique que donde pinta la "O" haya un "."
     * @param matriz bidimensional se asume que tiene "." en la posiciones libres
     * @param fila Representa la coordenada donde la pintar la "O"
     * @param columna Lo mismo que fila
     */
        public  static  void pintarO (char [][]matriz, int fila , int columna){
            if (fila > matriz.length) {
                System.out.println("Coordenada invalida");
            } else if (columna > matriz[0].length) {
                System.out.println("Coordenada invalida");
            } else if (fila < 0) {
                System.out.println("odio las matrices :(");
            } else if (columna < 0) {
                System.out.println("Coordenada invalida ");


            } else {
                if ( matriz[fila][columna]== '.' )
                     matriz[fila][columna]='O';
                else {
                    System.out.println("ERROR POCISION OCUPADA ");
                }
            }
    }

    /**
     * Comprueba la victoria del usuario con los if que contienen las
     * coordenadas posibles de victoria(Tres fichas alineadas)
     * @param matriz bidimensional indicar que tiene que ser 3x3 
     * @param ficha "X" o "O"
     * @return True si hay 3 fichas alineadas
     */
    public static boolean comprobarVictoria(char [] [] matriz,char ficha){
for (int i = 0; i < matriz.length; i++){
    if ((matriz[i][0]==ficha) && (matriz[i][1]==ficha)&&(matriz[i][2]==ficha)){
     return true;
    }

    }
for (int y = 0; y < matriz[0].length; y++){
if ((matriz[0][y]==ficha)&&(matriz[1][y]==ficha)&&(matriz[2][y]== ficha)){
    return true;
}
}if ((matriz[0][0]==ficha)&&(matriz[1][1]==ficha)&&(matriz[2][2]==ficha)) {
        return true;
    }
if ((matriz[0][2]==ficha)&&(matriz[1][1]==ficha)&&(matriz[2][0]==ficha)){
    return true;
    }
return false;
    }

    public static boolean hayCasillasDisponibles(char [] [] matriz){
        for(int i = 0; i < matriz.length; i++){
            for (int j =0; j< matriz[0].length; j++){
                if (matriz[i][j]=='.'){
                    return true;
                }

            }

        }
        return false;
    }




    public static void main(String[] args) {
        // Matriz de 3x3
        char [][] matriz =  {{'.','.','.'}
                            ,{'.','.','.'}
                            ,{'.','.','.' }};


        Scanner teclado= new Scanner(System.in);
        do{

            System.out.println("JUGADOR 'X' INTRODUCE LA FILA");

            int filaX=teclado.nextInt();
            System.out.println("INTRODUCE LA COLUMNA");
            int columnaX=teclado.nextInt();
            pintarX(matriz,filaX,columnaX);

            imprimirMatriz(matriz);
if (comprobarVictoria(matriz,'X') || (!hayCasillasDisponibles(matriz))){
    break;
}
            System.out.println("JUGADOR 'O' INTRODUCE LA FILA");

            int filaO=teclado.nextInt();
            System.out.println("INTRODUCE LA COLUMNA");
            int columnaO=teclado.nextInt();
            pintarO(matriz,filaO,columnaO);


            imprimirMatriz(matriz);
        }while (!comprobarVictoria(matriz ,'X')  && !comprobarVictoria(matriz,'O') && hayCasillasDisponibles(matriz));
if (comprobarVictoria(matriz,'X')){
    System.out.println("HAN GANADO LAS X");
}else if (comprobarVictoria(matriz,'O')){
    System.out.println("HAN GANADO LAS O");
}else {
    System.out.println("HAN EMPATADO FELICIDADES A LOS DOS PORFAVOR DAR AL BOTNO VERDE PARA VOLVER A EMPRAZAR");
}




        //mprime la matriz con los valores

    }
}