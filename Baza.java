import java.util.ArrayList;

public class Baza
{
    // instance variables - replace the example below with your own
    private int numeroJugadoresQueTiranCarta;
    
    private int paloQuePinta;
    
    private ArrayList<Carta> baza;
    
    private ArrayList<String> nombreJugadores;
    
    private Jugador[] jugadores;
    
    private int posicionGanadora;

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numeroJugadoresATirarCarta, int paloAPintar)
    {
        numeroJugadoresQueTiranCarta = numeroJugadoresATirarCarta;
        paloQuePinta = paloAPintar;
        baza = new ArrayList<Carta>();
        nombreJugadores = new ArrayList<String>();
        jugadores = new Jugador[numeroJugadoresATirarCarta];
        posicionGanadora = 0;
    }

    public void addCarta(Carta cartaATirar, String jugadorQueTiraLaCarta)
    {
        baza.add(cartaATirar);
        nombreJugadores.add(jugadorQueTiraLaCarta);
    }
    
    public int getPaloPrimeraCartaDeLaBaza()
    {
        int palo = -1;
        if (baza.size() > 0) {
            palo = baza.get(0).getPalo();
        }
        return palo;
    }
    
    public Carta cartaQueVaGanandoLaBaza()
    {
        Carta cartaADevolver = null;
        int contador = 0;
        int contador2 = 0;
        while (contador < baza.size()) {
            if (cartaADevolver == null) {
                cartaADevolver = baza.get(0);
            }
            if (!cartaADevolver.ganaA(baza.get(contador), paloQuePinta)) {
                cartaADevolver = baza.get(contador);
                contador2 = contador;
            }
            contador++;
        }
        posicionGanadora = contador2;
        return cartaADevolver;
    }
    
    public String nombreJugadorQueVaGanandoLaBaza()
    {
        String jugadorQueVaGanandoLaBaza = "";
        if (baza.size() > 0) {
            jugadorQueVaGanandoLaBaza = nombreJugadores.get(posicionGanadora);
            
        }
        else {
            jugadorQueVaGanandoLaBaza = "No hay ninguna carta en la baza.";
        }
        return jugadorQueVaGanandoLaBaza;
    }
}






