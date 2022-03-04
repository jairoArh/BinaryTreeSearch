package model;

public class Car {
    private String plate;
    private String tradeMark;
    private int model;
    private String color;

    public Car(String plate, String tradeMark, int model, String color) {
        this.plate = plate;
        this.tradeMark = tradeMark;
        this.model = model;
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", tradeMark='" + tradeMark + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                '}';
    }
}
