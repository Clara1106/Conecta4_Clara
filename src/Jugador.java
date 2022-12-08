import java.awt.*;

public class Jugador {
    private String nombre;
    private final char LETRAFICHA;
    private final Color COLORFICHA;
    private Ficha miFicha;
    private Tablero miTablero;

    public Jugador(String nombre, char letraFicha, Color colorFicha, Tablero miTablero) {
        this.nombre = nombre;
        this.LETRAFICHA = letraFicha;
        this.COLORFICHA = colorFicha;
        this.miTablero = miTablero;
        miFicha = new Ficha(LETRAFICHA, COLORFICHA);
    }
}


