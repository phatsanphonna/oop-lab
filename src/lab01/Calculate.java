package lab01;


import java.util.Scanner;

/**
 *
 * @author phats
 */
public class Calculate {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num1, num2 = 6;
	
	System.out.print("Enter value ");
	num1 = sc.nextInt();
	
	num1 = num1 + 2;
	num2 = num1 / num2;
	
	System.err.println("result = " + num2);
    }
}
