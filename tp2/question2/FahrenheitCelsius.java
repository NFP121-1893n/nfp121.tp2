package question2;
import java.util.Scanner;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * Cette Classe est un simple converteur de fahrenheit en celsius
 * @author (Jose Gebrael) 
 * @version (13-1-2022)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         String fahrenheit = in.nextLine();
         int x = 0;
       try{
           x = Integer.parseInt(fahrenheit);
           float celsius = Math.round(fahrenheitEnCelsius(x) * 1000.0F) / 1000.0F;
           System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       return (float)(double)((f-32.0)*(5.0/9.0));    // à compléter    en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }

}
