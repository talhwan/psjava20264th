package j062;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public void printAll(List list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        Main m = new Main();
        List<Word> words = new ArrayList<>();
        System.out.println(words.size());
        Word word = new Word("phone", "전화기", 1);
        Word word1 = new Word("chair", "의자", 1);
        words.add(word);
        words.add(word1);
        System.out.println(words.size());

        /*for(int i=0;i<words.size();i++){
            System.out.println(i + " : " + words.get(i));
        }*/
        m.printAll(words);
        //1)
        words.get(0).setMeaning("전화!!!");
        //2)
        Word aaaa = words.get(0);
        aaaa.setMeaning("전화~~~");
        aaaa.setLevel(0);

        /*for(int i=0;i<words.size();i++){
            System.out.println(i + " : " + words.get(i));
        }*/
        m.printAll(words);

        words.remove(1);
        m.printAll(words);

        /*
        배열!
        동일한 자료형을 여러개 저장할때!!

        List!!!

        Integer[] array_1 = new Integer[10];
        array_1 = new Integer[11];

        //array_1[0]

        List<String> list_1 = new ArrayList<>();
        System.out.println(list_1.size());

        list_1.add("100");
        list_1.add("200");
        list_1.add("300");
        //ist_1.get(0)

        System.out.println(list_1.size());

        for(int i = 0; i < list_1.size(); i++){
            System.out.println(i + ":" + list_1.get(i));
        }

        list_1.remove(1);

        for(int i = 0; i < list_1.size(); i++){
            System.out.println(i + ":" + list_1.get(i));
        }

        list_1.add(1, "200-1");
        for(int i = 0; i < list_1.size(); i++){
            System.out.println(i + ":" + list_1.get(i));
        }

         */


    }
}
