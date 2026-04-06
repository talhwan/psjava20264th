package j031;

import java.util.Scanner;

public class J031 {
    public static void main(String[] args) {
        J031 ps = new J031();
        ps.j032();
    }
    public void j031() {
        System.out.println("j031");

        /*String aaa = "aaa";
        String test1 = "0123456789";
        String test1_1 = test1.substring(0, 5);
        String test1_2 = test1.substring(5, 7);
        System.out.println(test1);
        System.out.println(test1_1);
        System.out.println(test1_2);

        String hello = "Hello!";
        int indexOfHello = hello.indexOf("a");
        System.out.println(indexOfHello);
        int aaa = indexOf("0123456", "5");
        System.out.println(aaa);
        */

        String userId = "";
        String password = "";
        String name = "";
        Scanner sc = new Scanner(System.in);
        userId = sc.nextLine();
        password = sc.nextLine();
        name = sc.nextLine();

        if(password.length() < 3) {
            System.out.println("Error: Password length less than 3!");
        } else {
            String newPassword = "";
            for(int i = 0; i < password.length(); i++) {
                if(i > 1){
                    newPassword += "*";
                } else {
                    newPassword += password.charAt(i);
                }
            }
            System.out.println(userId);
            System.out.println(password);
            System.out.println(newPassword);
            System.out.println(name);
        }
    }
    public void j032(){
        System.out.println("j032");
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(str);
        String reverse = "";
        for(int i = 0;i < str.length();i++) {
            int reverse_int = str.length() - 1 - i;
            reverse += str.substring(reverse_int, reverse_int+1);
        }
        System.out.println(reverse);
    }
    public void test1() {
        int aa = indexOf("12345", "3");
        System.out.println(aa);
    }
    public int indexOf(String a, String b) {
        // a 안에 b가 있는지 확인하고, 위치한다면 몇번째에 위치하는지 리턴
        // 없으면 -1 을 리턴해주세요!
        // a : 12345
        // b : 1234
        int returnValue = -1;
        int b_length = b.length();
        for(int i = 0; i < a.length() - b_length + 1; i++) {
            String temp = a.substring(i, i + b_length);
            if(temp.equals(b)) {
                returnValue = i;
                break;
            }
        }
        return returnValue;
    }

    public void test(){
        // 12:00 ~ 11:59 , 12:00 ~~ 11:59
        // 12:03, 04:07 .....
        // 하루중에, 3이 있을때만 한번씩 카운트!
        // 총 몇번일까요?
        String hour = "";
        String minute = "";
        int count = 0;
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                hour = i + "";
                if(i < 10){
                    hour = "0" + i;
                }
                if(i == 0){
                    hour = "12";
                }
                minute = j + "";
                if(j < 10){
                    minute = "0" + j;
                }
                //System.out.println(hour + ":" + minute);
                String text = hour + ":" + minute;
                if(text.contains("3")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
