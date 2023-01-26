package lab01;

import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();

        System.out.println(length * length);
    }
}
