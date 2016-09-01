/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreversinator;

import java.util.Scanner;
import static textreversinator.SubMondat.textSB;

/**
 *
 * @author user
 */
public class Mondat {

        public static String text;
    
        public static String mondat(){ 
            Written ir = new Written();
                System.out.println("Imput text: ");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                ir.setIrat(input);
                text = ir.getIrat();
            return text;
            }
        
}
        
