/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author phats
 */
public class OddEven {
    public static void main(String[] args) {
	int odd = 0;
	int even = 0;
	
	Scanner sc = new Scanner(System.in);

	while (true) {
	    int number = sc.nextInt();
	    
	    if (number == -1) {
		break;
	    }
	    
	    if (number % 2 == 0) {
		odd++;
	    } else {
		even++;
	    }
	}
	
	System.out.printf("Odd number = %d and Even number = %d\n", odd, even);
    }
    
}
