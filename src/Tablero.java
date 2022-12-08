public class Tablero {
    private Casilla[][] casillas;
    private int numFilas;
    private int numColumnas;

    private final int INICIO = 0;

    public Tablero(int numFilas, int numColumnas) {
        this.casillas = new Casilla[this.numFilas][this.numColumnas];
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        inicializarTablero();
    }

    public void inicializarTablero(){
        for (int fila = INICIO; fila < this.numFilas; fila++){
            for (int columna = INICIO; columna < this.numColumnas; columna++){
                this.casillas[fila][columna] =new Casilla();
            }
        }
    }

    public void dibujar(){
        for (int fila = INICIO; fila < this.numFilas; fila++){
            for (int columna = INICIO; columna < numColumnas; columna++) {

            }
        }
    }


}
