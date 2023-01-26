package lab01;

/**
 *
 * @author phats
 */
public class Calculate00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int a = 9, b = 4, c, d;

	c = b++ * ++a;
	d = ++b * a++;
	
	System.out.println("C is " + c);
	System.out.println("D is " + d);
    }
    
}
