package j021;

import java.util.Scanner;

public class J021 {
    public static void main(String[] args) {
        J021 j021 = new J021();
        j021.j021();
    }
    public void j021(){
        System.out.println("J021");
        int people = 0;
        int height, weight;
        double bmi;

        int numbers;
        Scanner input = new Scanner(System.in);
        numbers = input.nextInt();

        int checkNumbers = 0;
        while(true){
            checkNumbers++;
            height = input.nextInt();
            weight = input.nextInt();
            bmi = weight / (height  * 0.01 * height * 0.01);
            if(bmi >= 25){
                people++;
            }
            if(checkNumbers >= numbers){
                break;
            }
        }
        System.out.println(people);

        //그냥 for 문!!
        /*for(int i = 0; i < numbers; i++){
            height = input.nextInt();
            weight = input.nextInt();
            bmi = weight / (height  * 0.01 * height * 0.01);
            if(bmi >= 25){
                people++;
            }
        }
        System.out.println(people);*/

        /*int[] heights = new int[numbers];
        int[] weights = new int[numbers];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt();
            weights[i] = input.nextInt();
            bmi = weights[i] / (heights[i]  * 0.01 * heights[i] * 0.01);
            if(bmi >= 25){
                people++;
            }
        }
        System.out.println("People: " + people);*/

        /*int[][] hws = new int[numbers][2];
        for (int i = 0; i < hws.length; i++) {
            for (int j = 0; j < hws[i].length; j++) {
                hws[i][j] = input.nextInt();
            }
            bmi = hws[i][1] / (hws[i][0]  * 0.01 * hws[i][0] * 0.01);
            if(bmi >= 25){
                people++;
            }
        }
        System.out.println("People: " + people);*/
        int[][] hws = new int[numbers][3];
        for (int i = 0; i < hws.length; i++) {
            hws[i][0] = input.nextInt();
            hws[i][1] = input.nextInt();
            bmi = hws[i][1] / (hws[i][0]  * 0.01 * hws[i][0] * 0.01);
            if(bmi >= 25){
                people++;
                hws[i][2] = 1;
            }
        }
        System.out.println("People : " + people);
        for (int i = 0; i < hws.length; i++) {
            System.out.println(i + ") fat ? : " + hws[i][2]);
        }


    }
}
