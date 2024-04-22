public class Barco {
private int fila;
private int columna;
private int longitud;
// construcitor
    public Barco(int fila, int columna, int longitud) {
        this.fila = fila;
        this.columna = columna;
        this.longitud = longitud;
    }
    // getters
    public int getFila(){
        return fila;
    }
    public int getColumna(){
        return  columna;
    }
    public int getLongitud(){
        return longitud;
    }

}
