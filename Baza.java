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
    
    public Carta cartaQueVaGanandoLaBaza()
    {
        Carta cartaADevolver = null;
        int contador = 0;
        while (contador < baza.size()) {
            if (cartaADevolver == null) {
                cartaADevolver = baza.get(0);
            }
            if (!cartaADevolver.ganaA(baza.get(contador), paloQuePinta)) {
                cartaADevolver = baza.get(contador);
            }
            contador++;
        }
        return cartaADevolver;
    }
    
}






