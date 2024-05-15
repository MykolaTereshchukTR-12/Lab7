package org.example;

public class Car {

    private String model;
    private double enginePower;
    private String driverName;
    private double price;
    private String releaseDate;

    public Car(String model, double enginePower, String driverName, double price, String releaseDate) {
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

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) { this.enginePower = enginePower; }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double caRepair(double power, double percentages) {
        return (power + ((power*percentages)/100));
    }

    public double priceIncrease(double price, double percentages) {
        return (price + ((price*percentages)/100));
    }
}
