/*
 * A textreverzinator egy szövegfordítprogram.
 */
package textreversinator;

import java.util.Scanner;
import static textreversinator.SubMondat.textSB;

/**
 *
 * @author bodnart
 */
public class Mondat {

/**
* Ebben az osztályban olvassuk be a felhasználó álal beírt szöveget.
*/
    
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
        
