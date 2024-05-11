package org.example;

public class Car {

    private String model;
    private int enginePower;
    private String driverName;
    private int price;
    private String releaseDate;

    public Car(String model, int enginePower, String driverName, int price, String releaseDate) {
        this.model = model;
        this.enginePower = enginePower;
        this.driverName = driverName;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
