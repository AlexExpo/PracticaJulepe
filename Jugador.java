import java.util.Random;
public class Jugador
{
    // instance variables - replace the example below with your own
    private Carta[] cartasEnMano;
    
    private String nombre;
    
    private int numeroCartasEnMano;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombreJugador)
    {
        // initialise instance variables
        nombre = nombreJugador;
        cartasEnMano = new Carta[5];
        numeroCartasEnMano = 0;
    }
    
    public void recibirCarta(Carta cartaRecibida)
    {
        if (numeroCartasEnMano < 5) {
            cartasEnMano[numeroCartasEnMano] = cartaRecibida;
            numeroCartasEnMano++;
        }
    }

    public void verCartasJugador()
    {
        for (Carta cartaActual : cartasEnMano) {
            if (cartaActual != null) {
                System.out.println(cartaActual);
            }
        }
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public Carta tirarCarta(String nombreCarta)
    {
        Carta cartaTirada = null;
        if (numeroCartasEnMano > 0) {
            int cartaActual = 0;
            boolean buscando = true;
            while (cartaActual < cartasEnMano.length && buscando) {
                if (cartasEnMano[cartaActual] != null) {
                    if (nombreCarta.equals(cartasEnMano[cartaActual].toString())) {
                        buscando = false;
                        cartaTirada = cartasEnMano[cartaActual];
                        cartasEnMano[cartaActual] = null;
                        System.out.println("El jugador " + nombre + " ha tirado la carta: " + cartaTirada + ".");
                        numeroCartasEnMano--;
                    }
                }
                cartaActual++;
            }
        }
        return cartaTirada;
    }
    
    public Carta tirarCartaAleatoria()
    {
        Carta cartaTirada = null;
        if (numeroCartasEnMano > 0) {
            Random aleatorio = new Random();
            boolean elJugadorHaTiradoUnaCarta = false;
            while (elJugadorHaTiradoUnaCarta == false) {
                int posicionAleatoria = aleatorio.nextInt(5);
                if (cartasEnMano[posicionAleatoria] != null) {
                    cartaTirada = cartasEnMano[posicionAleatoria];
                    cartasEnMano[posicionAleatoria] = null;
                    numeroCartasEnMano--;
                    System.out.println("El jugador " + nombre + " ha tirado la carta: " + cartaTirada + ".");
                    elJugadorHaTiradoUnaCarta = true;
                }
            }
        }
        return cartaTirada;
    }
}







