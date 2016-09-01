/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreversinator;

import static textreversinator.SubMondat.*;
import static textreversinator.KettosBetu.*;


/**
 *
 * @author user
 */
public class KijelentoMondat {
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
