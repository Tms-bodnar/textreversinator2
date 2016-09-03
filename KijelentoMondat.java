/*
 *A textreverzinator egy szövegmegfordító program
 */
package textreversinator;

import static textreversinator.SubMondat.*;
import static textreversinator.KettosBetu.*;

/**
 *
 * @author bodnart
 */
public class KijelentoMondat {
    
/**
*Ebben az osztályban a pontra végz?d? mondatokat manipuláljuk.
* Ha szóközzel kezd?dik, azt töröljük, a további feldolgozhatóság érdekében.
* lefuttatjuk a kettosBetu() tagfüggvényt, hogy a kett?s bet?k megfelel?en jelenjenek meg a megfordított mondatban
* áthelyezzük a nagybet?ket, majd az így létrehozott submondatot továbbítjuk a mondatok StringBuildernek.
*/    
    public static StringBuilder kijelentoMondat() {
                String subMondattxt;
              
                if (textSB.charAt(0) == ' '){
                    textSB.deleteCharAt(0);
                    length = textSB.length();
                    pont = textSB.indexOf(".");
                }
                  kettosBetu();
                if (pont == length -1 ){
                    String subMondatTxt = textSB.substring(0);
                    subMondattxt = subMondatTxt;
                if (Character.isUpperCase(subMondattxt.charAt(0))){
                    String lower = subMondattxt.substring(0,subMondattxt.length()-2).toLowerCase();
                    String upper =subMondattxt.substring(subMondattxt.length()-2).toUpperCase();
                    String subMondatTxt1 = lower + upper;
                    subMondattxt = subMondatTxt1;
                }
                }
                else{
                String subMondatTxt = textSB.substring(0, pont+1);
                subMondattxt = subMondatTxt;
                
                if (Character.isUpperCase(subMondattxt.charAt(0))){
                    String lower = subMondattxt.substring(0,subMondattxt.length()-2).toLowerCase();
                    String upper =subMondattxt.substring(subMondattxt.length()-2).toUpperCase();
                    String subMondatTxt1 = lower + upper;
                    subMondattxt = subMondatTxt1;
                }
                }
                
                subMondat = new StringBuilder(subMondattxt);
                textSB1 = new StringBuilder(textSB.delete(0, pont+1));
                textSB = textSB1;
                length = subMondat.length()-1;
                pont = textSB.indexOf(".");
                fJel = textSB.indexOf("!");
                kJel = textSB.indexOf("?");
                 if (subMondat.charAt(length ) == '.'){
                    subMondat.insert(0, '.');
                    subMondat.deleteCharAt(length+1);
                }
                String subMondatP;
                subMondatP = subMondat.toString();
                mondatok.add(subMondatP); 
                return subMondat;
    }
            
}
