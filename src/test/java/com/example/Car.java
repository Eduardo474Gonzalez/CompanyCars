package com.example;

public class Car {

    private String model;
    private String color;
    private CarType type;
    private Double price;

    public Car() {

    }

    public Car(String model, String color, CarType type, Double price) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
    }






    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

   public String getColor() {
        return color;
   }

    public void setColor(String color) {
        this.color = color;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public static String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
