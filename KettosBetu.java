/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreversinator;
import java.util.ArrayList;
import java.util.Scanner;
import static textreversinator.Mondat.*;
import static textreversinator.KijelentoMondat.*;
import static textreversinator.FelkialtoMondat.*;
import static textreversinator.KerdoMondat.*;
import static textreversinator.SubMondat.*;
/**
 *
 * @author bodnart
 */
public class KettosBetu {
    
    public static StringBuilder  kettosBetu(){
        
        for (int i = 0; i < length - 1; i++){
            //cs
            if (textSB.charAt(i) == 'c' &&  textSB.charAt(i + 1) == 's'){
                textSB.setCharAt(i, 's');
                textSB.setCharAt(i + 1 , 'c');
            }
            if (textSB.charAt(i) == 'C' &&  textSB.charAt(i + 1) == 's'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 1 , 'c');
            }
            if (textSB.charAt(i) == 'C' &&  textSB.charAt(i + 1) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 1 , 'C');
            }
            if (textSB.charAt(i) == 'c' &&  textSB.charAt(i + 1) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 1 , 'c');
            }
            //dzs
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'z' && textSB.charAt(i + 2) == 's'){
                textSB.setCharAt(i, 's');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'z' && textSB.charAt(i + 2) == 's'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'Z' && textSB.charAt(i + 2) == 's'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'Z' && textSB.charAt(i + 2) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'D');
            }
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'Z' && textSB.charAt(i + 2) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'z' && textSB.charAt(i + 2) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
            //dz            
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'z'){
                textSB.setCharAt(i, 'Z');
                textSB.setCharAt(i + 1 , 'd');
            }
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'z'){
                textSB.setCharAt(i, 'z');
                textSB.setCharAt(i + 1 , 'd');
            }
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'Z'){
                textSB.setCharAt(i, 'Z');
                textSB.setCharAt(i + 1 , 'd');
            }
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'Z'){
                textSB.setCharAt(i, 'Z');
                textSB.setCharAt(i + 1 , 'd');
            }
            //gy
            if (textSB.charAt(i) == 'g' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'y');
                textSB.setCharAt(i + 1 , 'g');
            }
            if (textSB.charAt(i) == 'G' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'g');
            }
            if (textSB.charAt(i) == 'G' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'G');
            }
            if (textSB.charAt(i) == 'g' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'g');
            }
            //ly
            if (textSB.charAt(i) == 'l' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'y');
                textSB.setCharAt(i + 1 , 'l');
            }
            if (textSB.charAt(i) == 'L' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'l');
            }
            if (textSB.charAt(i) == 'L' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'L');
            }
            if (textSB.charAt(i) == 'l' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'l');
            }
            //ny
             if (textSB.charAt(i) == 'n' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'y');
                textSB.setCharAt(i + 1 , 'n');
            }
            if (textSB.charAt(i) == 'N' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'n');
            }
            if (textSB.charAt(i) == 'N' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'N');
            }
            if (textSB.charAt(i) == 'n' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'n');
            }
            //ty
             if (textSB.charAt(i) == 't' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'y');
                textSB.setCharAt(i + 1 , 't');
            }
            if (textSB.charAt(i) == 'T' &&  textSB.charAt(i + 1) == 'y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 't');
            }
            if (textSB.charAt(i) == 'T' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 'T');
            }
            if (textSB.charAt(i) == 't' &&  textSB.charAt(i + 1) == 'Y'){
                textSB.setCharAt(i, 'Y');
                textSB.setCharAt(i + 1 , 't');
            }
//            //zs
             if (textSB.charAt(i) == 'z' &&  textSB.charAt(i + 1) == 's'){
                textSB.setCharAt(i, 's');
                textSB.setCharAt(i + 1 , 'z');
            }
            if (textSB.charAt(i) == 'Z' &&  textSB.charAt(i + 1) == 's'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 1 , 'z');
            }
            if (textSB.charAt(i) == 'Z' &&  textSB.charAt(i + 1) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 1 , 'Z');
            }
            if (textSB.charAt(i) == 'z' &&  textSB.charAt(i + 1) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 1 , 'z');
            }
            //sz
            if (textSB.charAt(i) == 's' &&  textSB.charAt(i + 1) == 'z'){
                textSB.setCharAt(i, 'z');
                textSB.setCharAt(i + 1 , 's');
            }
            if (textSB.charAt(i) == 'S' && textSB.charAt(i + 1) == 'z'){
                textSB.setCharAt(i, 'Z');
                textSB.setCharAt(i + 1, 's');
            }
            if (textSB.charAt(i) == 'S' && textSB.charAt(i+1) == 'Z'){
                textSB.setCharAt(i, 'Z');
                textSB.setCharAt(i + 1 , 'S');
            }
            if (textSB.charAt(i) == 's' && textSB.charAt(i + 1) == 'Z'){
                textSB.setCharAt(i, 'Z');
                textSB.setCharAt(i + 1 , 's');
            }
            //ch
             if (textSB.charAt(i) == 'c' &&  textSB.charAt(i + 1) == 'h'){
                textSB.setCharAt(i, 'h');
                textSB.setCharAt(i + 1 , 'c');
            }
            if (textSB.charAt(i) == 'C' &&  textSB.charAt(i + 1) == 'h'){
                textSB.setCharAt(i, 'H');
                textSB.setCharAt(i + 1 , 'c');
            }
            if (textSB.charAt(i) == 'C' &&  textSB.charAt(i + 1) == 'H'){
                textSB.setCharAt(i, 'H');
                textSB.setCharAt(i + 1 , 'C');
            }
            if (textSB.charAt(i) == 'c' &&  textSB.charAt(i + 1) == 'H'){
                textSB.setCharAt(i, 'H');
                textSB.setCharAt(i + 1 , 'c');
            }
            //dzs
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'z' && textSB.charAt(i + 2) == 's'){
                textSB.setCharAt(i, 's');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'z' && textSB.charAt(i + 2) == 's'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'Z' && textSB.charAt(i + 2) == 's'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'D' &&  textSB.charAt(i + 1) == 'Z' && textSB.charAt(i + 2) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'D');
            }
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'Z' && textSB.charAt(i + 2) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
            if (textSB.charAt(i) == 'd' &&  textSB.charAt(i + 1) == 'z' && textSB.charAt(i + 2) == 'S'){
                textSB.setCharAt(i, 'S');
                textSB.setCharAt(i + 2 , 'd');
            }
        
        }
        
        
        return textSB;
    }
}
