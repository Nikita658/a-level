package ua.Bykov.HW6;

public class Phone {
    int number;
    String model;
    double weight;

    Phone() {
    }

    Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, double weight) {
        this.number = number;
        this.weight = weight;
    }

    public String fillingTheTelephone() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model +
                ", weight=" + weight +
                '}';
    }

    void receiveCall(String name) {
        System.out.println("call" + name);
    }

    int getNumber() {
        return this.number;
    }

}

