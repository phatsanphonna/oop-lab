package lab02;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double salaryWithTax;

        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        if (salary > 50000) {
            salaryWithTax = salary * 1.10;
        } else {
            salaryWithTax = salary * 1.05;
        }

        System.out.println(salaryWithTax);
    }
}
