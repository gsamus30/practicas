public class Barco {
    //Variables
    private int fila;
    private  int columna;
    private int longuitud;

    // Constructor
    public Barco (int fila,int columna, int longuitud){
        this.fila=fila;
        this.columna=columna;
        this.longuitud=longuitud;
    }

    //Getters

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getLonguitud() {
        return longuitud;
    }
}
