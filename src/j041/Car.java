package j041;

public class Car {
    private String model;
    private String color;
    private int speed;

    public Car() {}
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void speedUp() {
        this.speed++;
    }
}
