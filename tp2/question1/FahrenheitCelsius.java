package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * Cette Classe est un converteur fahrenheit en celsius
 * @author (Jose Gebrayel)
 * @version (13-1-2022)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        int fahrenheit = 0;
        float celsius = 0;
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                // format
                                                                                // impos�s
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

        return (float)(double)((f-32.0)*(5.0/9.0)); // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
    }

}
