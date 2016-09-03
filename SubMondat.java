/*
 *A textreverzinator egy sz�vegmegford�t� program
 */
package textreversinator;

import java.util.ArrayList;
import java.util.Scanner;
import static textreversinator.Mondat.*;
import static textreversinator.KijelentoMondat.*;
import static textreversinator.FelkialtoMondat.*;
import static textreversinator.KerdoMondat.*;


/**
 *
 * @author bodnart
 */
public class SubMondat {
    
/**
*Ebben az oszt�lyban tal�ljuk az irasjel() tagf�ggv�nyt, �s a suBmondat() tagf�ggv�nyt.
*/
            public static StringBuilder subMondat = null;
            public static StringBuilder textSB = new StringBuilder(Mondat.text);
            public static StringBuilder textSB1;
            public static ArrayList<String> mondatok = new ArrayList<>();
            public static int length = textSB.length();
            public static int pont = textSB.indexOf(".");
            public static int fJel = textSB.indexOf("!");
            public static int kJel = textSB.indexOf("?");
/*
 * Itt megvizsg�ljuk, hogy van-e �r�sjel a mondat v�g�n, ha nincs, elhelyez egy pontot a k�s?bbi feldolgozhat�s�g �rdek�ben.
 *
*/            
            public static StringBuilder irasJel(){
                if (textSB.charAt(0) == ' '){
                    textSB.deleteCharAt(0);
                 
                subMondat();        
                }
                else if( textSB.charAt(length-1) != '.' && textSB.charAt(length-1) != '!' && textSB.charAt(length - 1) != '?'){
                textSB.insert(length, '.');
                pont = textSB.indexOf(".");
                subMondat();
                }      
                else{
                subMondat();
                }
                return textSB;
            }
            
/*
 *Ebben a tagf�ggv�nyben a sz�veg tagmondatokra bont�sa t�rt�nik. Megkeress�k az �r�sjeleket
 *majd a helyzet�t?l f�gg?en elind�tjuk a mondat manipul�l� tagf�ggv�nyeket (kijelentoMondat(), kerdoMondat(), felkialtoMondat())
*/
            
            public static ArrayList subMondat(){                
            boolean jelP = ( pont > 0);
            boolean jelF = (fJel > 0 );
            boolean jelK = (kJel > 0 );
            
            if (pont == -1){
                pont = length + 100;
            }
            if (fJel == -1){
                fJel = length + 100;
            }
            if (kJel == -1){
                kJel = length + 100;
            }
            
              if (jelP || jelF || jelK){
                  if( jelP && pont < fJel && pont < kJel){
                      kijelentoMondat();
                      subMondat();
                  }
                  else if (jelF && fJel < pont && fJel < kJel){
                      
                      felkialtoMondat();
                      subMondat();
                  }
                  else if (jelK && kJel < pont && kJel < fJel){
                      kerdoMondat();
                      subMondat();
                  }
              }
              return mondatok;
            }
}   
