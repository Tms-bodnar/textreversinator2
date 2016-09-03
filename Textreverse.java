/*
 * A textreverzinator egy szövegfordítprogram.
 */
package textreversinator;

import static textreversinator.SubMondat.*;
import static textreversinator.Mondat.mondat;
import static textreversinator.Megfordito.*;
/**
 *
 * @author Bodnart
 */
public class Textreverse {

/**
*Ebben az osztályban található a main tgfüggvénünk, amiben elindítjuk a programunkat a mondat() tagfüggvény meghívásával.
*/
    
    public static void main(String[] args) {
    mondat();
    irasJel();
    megfordito();
    }
    
}
