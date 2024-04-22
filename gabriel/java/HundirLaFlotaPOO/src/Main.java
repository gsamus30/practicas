import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Barco barco = new Barco(0,1, 3);
        Barco barco2 = new Barco(1,0,2);

        List<Barco> listaDeBarcos = new ArrayList<>();
        listaDeBarcos.add(barco);
        listaDeBarcos.add(barco2);


        Tablero tablero = new Tablero(listaDeBarcos);

        tablero.mostrar();

    }
}