package j044;

import java.util.UUID;

public class MakePW {

    public static void main(String[] args) {
        MakePW makePW = new MakePW();
        makePW.make(12);
        makePW.make(5, 3);
    }

    String password;

    public MakePW() {
        password = null;
    }
    public void make(int length) {
        UUID uuid = UUID.randomUUID();
        password = uuid.toString().replace("-", "");
        password = password.substring(0, length);
        System.out.println(password);
    }
    public void make(int length, int amount) {
        for(int i = 0; i < amount; i++) {
            make(length);
        }
    }
}
