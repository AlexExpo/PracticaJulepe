
public class Carta
{
    // Valor de la carta: del 1 al 7 y del 10 al 12.
    private int valorDeLaCarta;
    // Valor del palo: 0 es oros, 1 es copas, 2 es espadas y 3 es bastos.
    private int paloDeLaCarta;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valorCarta, int paloCarta)
    {
        valorDeLaCarta = valorCarta;
        paloDeLaCarta = paloCarta;     
    }
    
    public String toString()
    {
        String textoDeLaCarta1 = "";
        String textoDeLaCarta2 = "" + valorDeLaCarta;
        switch (valorDeLaCarta) {
            case 1:
            textoDeLaCarta2 = "as";
            break;
            
            case 10:
            textoDeLaCarta2 = "sota";
            break;
            
            case 11:
            textoDeLaCarta2 = "caballo";
            break;
            
            case 12:
            textoDeLaCarta2 = "rey";
            break;
        }
        switch (paloDeLaCarta) {
            case 0:
            textoDeLaCarta1 = " de oros";
            break;
            
            case 1:
            textoDeLaCarta1 = " de copas";
            break;
            
            case 2:
            textoDeLaCarta1 = " de espadas";
            break;
            
            case 3:
            textoDeLaCarta1 = " de bastos";
            break;
        }
        return textoDeLaCarta2 + textoDeLaCarta1;
    }
    
    public int getValor()
    {
        return valorDeLaCarta;
    }
    
    public int getPalo()
    {
        return paloDeLaCarta;
    }
    
    public boolean ganaA(Carta cartaAComparar, int paloQuePinta)
    {
        boolean gana = false;
        if (paloDeLaCarta == cartaAComparar.getPalo()) {
            // En caso de que tengan el mismo palo...
            if (getPosicionEscalaTute() > cartaAComparar.getPosicionEscalaTute()) {
                gana = true;
            }
        }
        else {
            // En caso de que tengan distinto palo...
            if (cartaAComparar.getPalo() != paloQuePinta) {
                gana = true;
            }
        } 
        return gana;
    }
    
    public int getPosicionEscalaTute() 
    {
      int posicion = valorDeLaCarta;
    
      if (valorDeLaCarta == 3) {
          posicion = 13;
      }
      else if (valorDeLaCarta == 1) {
            posicion = 14;
      }
      return posicion;    
    }
}
    
    





