package j083;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

public class ScoreManager {
    public static void main(String[] args) {
        ScoreManager scoreManager = new ScoreManager();
        //scoreManager.out();
        //scoreManager.in();
        scoreManager.addScore(new Score("PARK", 90, 90, 90));
        Score aaa = scoreManager.searchScore("PARK");
        System.out.println(aaa);

        /*// Set?
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jane");

        for(int i=0;i<names.size();i++){
            String name = names.get(i);
            System.out.println(name);
        }
        //for each
        for(String name: names){
            System.out.println(name);
        }*/


    }

    List<Score> scores = null;
    Map<String, Score> scoresMap = null;
    public ScoreManager() {
        init();
    }
    public void init(){
        scores =  new ArrayList<>();
        scoresMap = new HashMap<>();
        in();
    }
    public void addScore(Score score){
        for(int i=0;i<scores.size();i++){
            if(scores.get(i).getName().equals(score.getName())){
                score.setName(score.getName() + "!");
            }
        }
        scores.add(score);
        out();
    }
    public void removeScore(Score score){
        for(int i=0;i<scores.size();i++){
            if(scores.get(i).getName().equals(score.getName())){
                scores.remove(i);
            }
        }
        scoresMap.remove(score.getName());
        out();
    }
    public Score searchScore(String name){
        for(int i=0;i<scores.size();i++){
            if(scores.get(i).getName().equals(name)){
                return scores.get(i);
            }
        }
        return null;
    }
    public String toString(){
        String result = "";
        /*for(int i=0;i<scores.size();i++){
            result += scores.get(i).toString();
        }*/
        String[] keys = scoresMap.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        /*for(int i=0;i<keys.length;i++){
            result += scoresMap.get(keys[i]).toString();
        }*/
        for(String key : keys){
            result += scoresMap.get(key).toString();
        }
        return result;
    }


    public void out() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/j083/j083.txt");
            String word = toString();

            byte b[] = word.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in() {
        try{
            File file = new File("./src/j083/j083.txt");
            Scanner scanner = new Scanner(file);
            int order = 0;
            while (scanner.hasNextLine()) {
                //System.out.println("data order : " + order++);
                //System.out.println(scanner.nextLine());
                String oneline = scanner.nextLine();
                String[] onelineArray = oneline.split(" ");
                String name = onelineArray[0];
                int kor = Integer.parseInt(onelineArray[1]);
                int eng = Integer.parseInt(onelineArray[2]);
                int mat = Integer.parseInt(onelineArray[3]);
                Score score = new Score(name, kor, eng, mat);
                scores.add(score);
                scoresMap.put(name, score);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
