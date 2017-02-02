import java.util.ArrayList;

public class Baza
{
    // instance variables - replace the example below with your own
    private int numeroJugadoresQueTiranCarta;
    
    private int paloQuePinta;
    
    private ArrayList<Carta> baza;
    
    private Jugador[] jugadores;

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numeroJugadoresATirarCarta, int paloAPintar)
    {
        numeroJugadoresQueTiranCarta = numeroJugadoresATirarCarta;
        paloQuePinta = paloAPintar;
        baza = new ArrayList<Carta>();
        jugadores = new Jugador[numeroJugadoresATirarCarta];
    }

    public void addCarta(Carta cartaATirar, String jugadorQueTiraLaCarta)
    {
        baza.add(cartaATirar);
    }
    
    public int getPaloPrimeraCartaDeLaBaza()
    {
        int palo = -1;
        if (baza.size() > 0) {
            palo = baza.get(0).getPalo();
        }
        return palo;
    }
}






