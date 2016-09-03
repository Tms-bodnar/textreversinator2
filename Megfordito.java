/*
 *A textreverzinator egy szövegmegfordító program
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
 *Ebben az ozstályban a mondatok Stringbuilderb?l képzünk egy srtinget szóközökkel, 
 * majd visszaalakítuk és megfordítjuk.
 */
    
    public static void megfordito(){
       
        String forditott = String.join(" ", mondatok);
        StringBuilder Forditott = new StringBuilder(forditott);
        Forditott.reverse();
        System.out.println(Forditott);
    }
}    
