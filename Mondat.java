/*
 * A textreverzinator egy sz�vegford�tprogram.
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
* Ebben az oszt�lyban olvassuk be a felhaszn�l� �lal be�rt sz�veget.
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
        
