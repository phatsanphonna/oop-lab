package lab01;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hours : ");
        int hours = sc.nextInt();

        System.out.print("Mins : ");
        int minutes = sc.nextInt();

        int seconds = hours * 60 * 60 + minutes * 60;
        System.out.print("Secs = " + seconds);
    }
}
