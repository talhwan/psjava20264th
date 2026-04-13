package j041;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

    int[] numbers;
    public Lotto(){
        remakeAuto();
    }
    public void printNumbers(){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public void remake(){
        numbers = new int[6];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            while(true){
                int number = input.nextInt();
                if(isValid(number)){
                    numbers[i] = number;
                    break;
                } else {
                    System.out.println("Please enter a 준복없는 number between 1 and 45");
                }
            }
        }
        sorting();
    }
    public void remakeAuto(){
        numbers = new int[6];
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            while(true){
                int number = rand.nextInt(45) + 1; // 0~44 -> 1~45
                if(isValid(number)){
                    numbers[i] = number;
                    break;
                }
            }
        }
        sorting();
    }
    public boolean isValid(int number){
        if(number < 1 || number > 45){
            return false;
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number){
                return false;
            }
        }
        return true;
    }
    public void sorting(){
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = 0; j < numbers.length - i - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}
