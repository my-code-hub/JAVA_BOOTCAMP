package lv.rcs.prebootcamp.lesson18.examples.comparing;

public class Car {

    private String model;
    private int year;
    private String color;
    private String vin;

    public Car() {
    }

    public Car(String model, int year, String color, String vin) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Car)) {
            return false;
        }
        Car car = (Car) other;
        return vin.equals(car.getVin());
    }
}
