//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ejemplo=7;
        int [] lista={15,39,-200,50,10,78,88888};
        char [] [] tablero = {{'.','.','.','.','.','.'},
                {'.','.','.','.','.','.'},{'.','.','.','.','.','.'},
                {'.','.','.','.','.','.'},{'.','.','.','.','.','.'},
                {'.','.','.','.','.','.'}};
        //lista= new int [6];
        /*
        * 1.Darle Valores
        * 2.Imprimir valores
        * 3.Declarar Tablero
        * 4.Darle Valores
        * 5.Imprimirlo
        * Home pintar barcos, pintar bordes
        * */
        int i=0;
        while(i<lista.length){
            System.out.print(lista[i]+" ");
            i++;
        }
        for (int j=0; j<tablero.length;j++){
            System.out.println();
            for (int t=0; t< tablero[j].length;t++){
                System.out.print(tablero[j][t]+"  ");
            }
        }

    }

}
