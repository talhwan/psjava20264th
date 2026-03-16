import java.util.Scanner;

public class MainLab01 {
    public static void main(String[] args) {
        MainLab01 ps = new MainLab01();
        ps.j005_1(); //여기서 호출해서요!!
    }
    void j000(){
        // 변수 선언!
        int int_a = 0;
        // float float_a = 0.0f;
        double double_a = 0.0;
        char char_a = 'a';
        boolean boolean_a = false;
        String string_a = ""; // null
    }
    void j001(){
        int height, weight;
        double bmi;
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        weight = sc.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);
        System.out.println("BMI = " + bmi);
    }
    void j002(){
        double c_degree;
        double f_degree;

        Scanner sc = new Scanner(System.in);
        c_degree = sc.nextDouble();
        f_degree = c_degree * 1.8 + 32;

        System.out.println("F = " + f_degree);
    }
    void j005(){
        //2월 : 28일
        // 1 3 5 7 8 10 12 : 31일
        // 4 6 9 11 : 30일
        int month, day;
        int day_count;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();
        day_count = calDateDays(month, day);
        System.out.println("Day count = " + day_count);
    }
    void j005_1(){
        int month, day;
        int month_today, day_today;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();
        month_today = sc.nextInt();
        day_today = sc.nextInt();

        int days = calDateDays(month, day);
        int days_today = calDateDays(month_today, day_today);
        int dday = days - days_today;

        System.out.println("Days today = " + dday);
    }
    int calDateDays(int month, int day){
        int day_count = 0;
        for(int i=1;i<month;i++){
            day_count += calMonthDays(i);
        }
        day_count += day;
        return day_count;
    }
    int calMonthDays(int month){
        int days = 0;
        switch (month) {
            case 2: days = 28; break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30; break;
            default: days = 31; break;
        }
        return days;
    }
}
