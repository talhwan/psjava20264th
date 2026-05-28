package week12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main ps = new Main();
        //ps.j011();
        ps.test();
    }

    public void test() {
        FileIO fileIO = new FileIO();
        fileIO.out();
        /*fileIO.in0();
        fileIO.in2();
        fileIO.in3();*/
    }

    public void j082() {
        FileIO fileIO = new FileIO();
        String text = fileIO.inScanner0("./src/week12/j082.txt");
        System.out.println(text);
        String[] datas = text.split("\n");
        int count = 0;
        int countFat = 0;
        for (String data : datas) {
            System.out.println(data);
            String[] words = data.split(" ");
            int height = Integer.parseInt(words[0]);
            int weight = Integer.parseInt(words[1]);
            double bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                System.out.println("비만");
                countFat++;
            } else {
                System.out.println("정상");
            }
            count++;
        }
        double ratioFat = (double) countFat / count;
        System.out.println(count);
        System.out.println(ratioFat);
    }
    public void j081() {
        FileIO fileIO = new FileIO();
        String text = fileIO.inScanner0("./src/week12/j081.txt");
        text = text.replaceAll("\n", "");
        //System.out.println(text);

        String[] arrayString = text.split(" ");
        int[] arrayInt = new int[arrayString.length];
        for(int i=0;i<arrayString.length;i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        Arrays.sort(arrayInt); // 일단 기본 정렬 완료!!

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[arrayInt.length-1]);
    }
}
