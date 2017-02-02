import java.util.Random;
import java.util.ArrayList;
public class Juego
{
    // instance variables - replace the example below with your own
    private Jugador[] listaJugadores;
    
    private ArrayList<String> nombreJugadores;
    
    private Mazo mazoDeJuego;
    
    private int paloQuePinta;
    
    private Jugador usuario;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores, String nombreUsuario)
    {
        // initialise instance variables
        usuario = new Jugador (nombreUsuario);
        mazoDeJuego = new Mazo();
        listaJugadores = new Jugador[numeroJugadores];
        listaJugadores[0] = usuario;
        nombreJugadores = new ArrayList<String>();
        nombreJugadores.add("Pepe");
        nombreJugadores.add("Maria");
        nombreJugadores.add("Ronaldo");
        nombreJugadores.add("Ana");
        nombreJugadores.add("Juan");
        nombreJugadores.add("Cristina");
        nombreJugadores.add("Pedro");
        nombreJugadores.add("Nuria");
        nombreJugadores.add("Manuel");
        nombreJugadores.add("Rocio");
        nombreJugadores.add("Daniel");
        nombreJugadores.add("Marina");
        nombreJugadores.add("Miguel");
        nombreJugadores.add("Raquel");
        nombreJugadores.add("Javier");
        nombreJugadores.add("Irene");
        nombreJugadores.add("Alex");
        nombreJugadores.add("Carmen");
        nombreJugadores.add("Julio");
        nombreJugadores.add("Sofia");
        System.out.println("¡¡¡¡¡Bienvenido al Julepe!!!!! Disfruta de la partida jugador: " + usuario.getNombre() + ".");
        System.out.println("Tus rivales son:");
        int contador = 1;
        while (numeroJugadores > contador) {
            Random aleatorio = new Random();
            int posicionAleatoria = aleatorio.nextInt(nombreJugadores.size());
            listaJugadores[contador] = new Jugador (nombreJugadores.remove(posicionAleatoria));
            contador++;
            }
        for (int contador2 = 1; contador2 < listaJugadores.length; contador2++) {
            System.out.println("Jugador: " + listaJugadores[contador2].getNombre() + ".");
        }
    }
    
    public void repartir()
    {
        mazoDeJuego.barajar();
        Carta cartaActual = null;
        int contador = 0;
        while (contador < 5) {
            for (Jugador jugadorActual : listaJugadores) {
                cartaActual = mazoDeJuego.sacarCarta();
                jugadorActual.recibirCarta(cartaActual);
            }
            contador++;
         }
        paloQuePinta = cartaActual.getPalo();
        switch (paloQuePinta) {
            case 0:
            System.out.println("Pintan Oros " + paloQuePinta + ".");
            break;
            
            case 1:
            System.out.println("Pintan Copas " + paloQuePinta + ".");
            break;
            
            case 2:
            System.out.println("Pintan Espadas " + paloQuePinta + ".");
            break;
            
            case 3:
            System.out.println("Pintan Bastos " + paloQuePinta + ".");
            break;
        }
        System.out.println("Tus cartas son:");
        usuario.verCartasJugador();
    }
    
    public void hacerTrampasYVerCartasDeJugador(String nombreJugador)
    {
        for (Jugador jugadorActual : listaJugadores) {
            if (jugadorActual.getNombre().equals(nombreJugador)) {
                jugadorActual.verCartasJugador();
            }
        }
    }
    
    public void verCartasJugadorHumano()
    {
        usuario.verCartasJugador();
    }
    
    //public Carta tirarCarta2(String cartaATirar)
    //{
        //Carta cartaADevolver = null;
        //boolean buscando = true;
        //for (int contador = 0; contador < listaJugadores.length && buscando; contador++) {
            //int contador2 = 0;
            //while (contador2 < 5 && buscando) {
                //if (listaJugadores[contador].cartasEnMano[contador2].toString().equals(cartaATirar)) {
                    //cartaADevolver = listaJugadores[contador].cartasEnMano[contador2];
                    //buscando = false;
                    //System.out.println("El jugador " + listaJugadores[contador].getNombre() + " ha tirado la carta: " + cartaADevolver + ".");
                //}
                //contador2++;
            //}
        //}
        //return cartaADevolver;
        
        
    //}
    
}




