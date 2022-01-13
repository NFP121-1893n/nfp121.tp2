package question2;
import java.util.Scanner;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * Cette Classe est un simple converteur de fahrenheit en celsius
 * @author (Jose Gebrael) 
 * @version (13-1-2022)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
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
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       return (float)(double)((f-32.0)*(5.0/9.0));    // � compl�ter    en rempla�ant la valeur retourn�e par la fonction de conversion
       // ...
     }

}
