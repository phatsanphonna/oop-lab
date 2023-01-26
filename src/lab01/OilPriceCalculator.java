package lab01;

import java.util.Scanner;

public class OilPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double oil = sc.nextDouble();

        System.out.println(oil * 30);
    }
}
