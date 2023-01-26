package lab01;

import java.util.Scanner;

public class MeanScoreCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        double average = (x + y + z) / 3;

        System.out.println(average);
    }
}
