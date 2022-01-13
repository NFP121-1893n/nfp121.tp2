package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * Cette Classe est un converteur fahrenheit en celsius
 * @author (Jose Gebrayel)
 * @version (13-1-2022)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0;
        float celsius = 0;
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                // format
                                                                                // imposés
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

        return (float)(double)((f-32.0)*(5.0/9.0)); // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }

}
