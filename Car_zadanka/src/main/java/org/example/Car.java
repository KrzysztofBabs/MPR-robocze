package org.example;

public class Car {
    private int battery;
    private int fuel;
    private int fuelCapacity;
    private float fuelConsumption;
    private float distance;

    public Car(int battery, int fuel, int fuelCapacity, float fuelConsumption) {
        this.battery = battery;
        this.fuel = fuel;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public boolean turnOnBattery(){
        if(this.fuel<20){
            System.out.println("masz malo paliwa, przechodze na baterie elektryczna!");
        }
        return true;
    }
    public boolean refuel(int paliwo){
        if(paliwo<=fuelCapacity-fuel){
            return true;
        }
        if(paliwo==0){
            return false;
        }
        if(paliwo<0){
            System.out.println("to niemozliwe");
            return false;
        }
        return true;

    }

    public boolean drive(float km){
        



    }

    public boolean turnOn(){
        return this.battery > 10 && this.fuel > 5;
    }


}
