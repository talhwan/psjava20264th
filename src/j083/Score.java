package j083;

public class Score {

    String name;
    int kor, eng, mat;
    int sum;
    double avg;

    public Score(String name, int kor, int eng, int mat, int sum, double avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = sum;
        this.avg = avg;
    }
    public Score(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = kor + eng + mat;
        this.avg = this.sum / 3.0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }
    public int getSum() {
        return sum;
    }
    public double getAvg() {
        return avg;
    }
    @Override
    public String toString() {
        return this.name + " " + this.kor + " " + this.eng + " " + this.mat + "\n";
    }
}
