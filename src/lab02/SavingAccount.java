package lab02;

import java.util.Scanner;

public class SavingAccount {
    public static void main(String[] args) {
        double interest;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();

        System.out.print("Input your account type(Please type A B C or X in uppercase) :");
        String plan = sc.nextLine();

        switch (plan) {
            case "B":
                interest = money * 1.02;
                break;
            case "A": case "C":
                interest = money * 1.015;
                break;
            case "X":
                interest = money * 1.05;
                break;
            default:
                interest = money;
        }

        System.out.println("Your total money in one year = " + interest);
    }
}
