import java.util.ArrayList;
import java.util.Random;
public class Mazo
{
    // instance variables - replace the example below with your own
    private ArrayList<Carta> mazo;
    
    private Random numerosAleatorios;
    
    private int cartaActual;

    /**
     * Constructor que crea las 40 cartas del mazo.
     */
    public Mazo()
    {
        // initialise instance variables
        mazo = new ArrayList<Carta>(40);
        
        int contadorDePalo = 0;
        while (contadorDePalo <= 3) {
            int contadorDeValor = 1;
            while (contadorDeValor <= 12) {
                if (contadorDeValor <= 7 || contadorDeValor >= 10) {
                    mazo.add(new Carta(contadorDeValor,contadorDePalo));
                }
                contadorDeValor++;
            }
            contadorDePalo++;
        }
    }
    
    /**
     * Metodo que imprime por pantalla la lista de cartas del mazo.
     */
    public void verCartasDelMazo()
    {   
        for (Carta carta : mazo) {
            System.out.println(carta);
        }
    }
    
    public void barajar()
    {
        for (int posicionActual = 0; posicionActual < mazo.size(); posicionActual++) {
            Carta carta = mazo.get(posicionActual);
            Random aleatorio = new Random();
            int posicionAleatoria = aleatorio.nextInt(mazo.size());
            mazo.set(posicionActual, mazo.get(posicionAleatoria));
            mazo.set(posicionAleatoria, carta);
        }
    }
    
    /**
     * Implementar un metodo llamado sacarCarta en la clase Mazo que devuelva
     * un objeto Carta. Concretamente debe devolver la primera carta del mazo, 
     * eliminando esta del mazo.
     */
    public Carta sacarCarta()
    {
        Carta cartaADevolver = null;
        if (mazo.size() > 0) {
            cartaADevolver = mazo.remove(0);
        }
        return cartaADevolver;
    }
    

}





