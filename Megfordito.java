/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreversinator;

import java.util.ArrayList;
import javax.sound.midi.Soundbank;
import static textreversinator.SubMondat.*;

/**
 *
 * @author user
 */
public class Megfordito {
    public static void megfordito(){
       
        String forditott = String.join(" ", mondatok);
        StringBuilder Forditott = new StringBuilder(forditott);
        Forditott.reverse();
        System.out.println(Forditott);
    }
}    
