import java.util.List;

public class Tablero {

    private List<Barco> listaBarcos;

    public Tablero(List<Barco> listaBarcos){
        this.listaBarcos=listaBarcos;
    }

    public void mostrar(){
        char [][] matriz ={{'.','.','.','.','.','.'}
                          ,{'.','.','.','.','.','.'}
                          ,{'.','.','.','.','.','.'}
                          ,{'.','.','.','.','.','.'}
                          ,{'.','.','.','.','.','.'}
                          ,{'.','.','.','.','.','.'}};

        for (Barco barco: listaBarcos){
            for(int i = 0 ; i < barco.getLonguitud(); i++)
                matriz[barco.getFila()][barco.getColumna() + i]='B';
        }


        for (int i = 0; i < matriz.length ; i++ ){
            System.out.println();
            for(int j = 0; j <matriz[0].length; j++){

                System.out.print(matriz[i][j]+" ");
            }
        }
    }


}
