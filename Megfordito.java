/*
 *A textreverzinator egy sz�vegmegford�t� program
 */
package textreversinator;

import java.util.ArrayList;
import javax.sound.midi.Soundbank;
import static textreversinator.SubMondat.*;

/**
 *
 * @author bodnart
 */
public class Megfordito {
    
 /*
 *Ebben az ozst�lyban a mondatok Stringbuilderb?l k�pz�nk egy srtinget sz�k�z�kkel, 
 * majd visszaalak�tuk �s megford�tjuk.
 */
    
    public static void megfordito(){
       
        String forditott = String.join(" ", mondatok);
        StringBuilder Forditott = new StringBuilder(forditott);
        Forditott.reverse();
        System.out.println(Forditott);
    }
}    
