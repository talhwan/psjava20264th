package j044;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Score score = new Score(2);
        score.getScore();
        score.printScore();
    }

    int count;
    int[][] jumsu;
    int[] sum_student;
    double[] avg_student;

    public Score(int count) {
        this.count = count;
        jumsu = new int[count][3];
        sum_student = new int[count];
        avg_student = new double[count];
    }
    public void getScore(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < jumsu.length; i++){
            System.out.println("국영수 순서대로 점수 입력!");
            sum_student[i] = 0;
            for(int j = 0; j < jumsu[i].length; j++){
                jumsu[i][j] = sc.nextInt();
                sum_student[i] += jumsu[i][j];
            }
            avg_student[i] = sum_student[i] / 3.0;
        }

    }
    public void printScore(){
        for(int i = 0; i < jumsu.length; i++){
            for(int j = 0; j < jumsu[i].length; j++){
                System.out.print(jumsu[i][j] + " ");
            }
            System.out.println();
            System.out.println(sum_student[i] + " " + avg_student[i] + " " + calGrade(avg_student[i]));
        }
    }
    public String calGrade(double avg){
        String grade;
        if(avg >= 90){
            grade = "A";
        } else if(avg >= 80){
            grade = "B";
        } else if(avg >= 70){
            grade = "C";
        } else if(avg >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
