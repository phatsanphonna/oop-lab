package lab01;

import java.util.Scanner;

public class YearConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int christianYear = sc.nextInt();
        int buddhistYear = christianYear + 543;

        System.out.println(buddhistYear);
    }
}
