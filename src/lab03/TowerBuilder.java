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
public class TowerBuilder {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("กรุณาระบุความสูงของตึก : ");
	int height = sc.nextInt();

	for (int i = 0; i < height; i++) {
	    System.out.println("#-#-#-#-#");
	}
    }
}
