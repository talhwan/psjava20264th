package j041;

import java.util.Arrays;

public class J041 {
    public static void main(String[] args) {
        J041 j041 = new J041();
        j041.j041();
    }
    public void j041(){
        Lotto lotto = new Lotto();
        int[] numbers1 = lotto.getNumbers();
        System.out.println(Arrays.toString(numbers1));
        lotto.remake();
        int[] numbers2 = lotto.getNumbers();
        System.out.println(Arrays.toString(numbers2));

        int count = 0;
        for(int i=0;i<numbers1.length;i++){
            for(int j=0;j<numbers2.length;j++){
                if(numbers1[i]==numbers2[j]){
                    count++;
                }
            }
        }
        System.out.println("count : " + count);
    }
}
