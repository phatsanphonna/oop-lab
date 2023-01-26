package lab01;

import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();

        System.out.println(price * 1.07);
    }
}
