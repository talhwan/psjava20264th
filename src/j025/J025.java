package j025;

import java.util.Scanner;

public class J025 {
    public static void main(String[] args) {
        J025 j025 = new J025();
        j025.j025();
    }
    public void j025() {
        System.out.println("J025");
        //int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month, day;
        int day_count = 0;
        int[] monthDays = new int[12];
        for(int i = 0; i < monthDays.length; i++){
            monthDays[i] = getDaysByMonth(i+1);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        month = input.nextInt();
        System.out.print("Enter the day: ");
        day = input.nextInt();
        for(int i = 0; i < month - 1; i++) {
            day_count += monthDays[i];
            //day_count += getDaysByMonth(i + 1);
        }
        day_count += day;

        System.out.print("day_count : " + day_count);
    }
    int getDaysByMonth(int month) {
        int days = 0;
        switch(month) {
            case 2: days = 28; break;
            case 4:case 6:case 9:case 11: days = 30; break;
            default: days = 31; break;
        }
        return days;
    }
}
