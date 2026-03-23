package j014;

import java.util.Scanner;

public class J014 {
    public static void main(String[] args) {
        J014 ps = new J014();
        ps.j014();
    }
    public void j014() {
        System.out.println("J014");
        int income;
        double tax;

        /*
        * 1000 < 9.5
        * 4000 < 19
        * 8000 < 28
        * 8000 >= 37
        * */

        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();

        if(income < 1000) {
            System.out.println("Income is less than 1000");
            tax = income * (9.5/ 100);
        } else if(income < 4000) {
            System.out.println("Income is less than 4000");
            tax = income * (19.0/ 100);
        } else if(income < 8000) {
            tax = income * (28.0 / 100);
        } else {
            tax = income * (37.0 / 100);
        }
        System.out.println("Tax is " + tax);
    }
}
