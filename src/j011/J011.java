package j011;

import java.util.Scanner;

public class J011 {
    public static void main(String[] args) {
        J011 ps = new J011();
        ps.j011();
    }
    public void j011() {
        System.out.println("J011");
        int height, weight;
        double bmi;

        Scanner input = new Scanner(System.in);
        height = input.nextInt();
        weight = input.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);

        if(bmi >= 25){
            System.out.println("BMI is greater than 25 => YES");
        } else {
            System.out.println("BMI is less than 25 => NO");
        }

    }
}
