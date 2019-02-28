package com.labs.car;


import java.util.Comparator;
import java.lang.*;

/*Таксопарк. Определить иерархию автомобилей (любых в том числе и
грузовых). Создать таксопарк. Создать управляющего. Его функции:
подсчитать стоимость автопарка, провести сортировку автомобилей парка по
расходу топлива, найти автомобиль в компании, соответствующий заданному
диапазону параметров скорости.
*/
public abstract class Car {
    public int getFuelRate() {
        return fuelRate;
    }

    public static Comparator<Car> COMPARE_BY_FUELRATE = new Comparator<Car>(){
        public int compare(Car one, Car other){
            return ((Integer)one.fuelRate).compareTo(other.getFuelRate());
        }

    };

    private void setFuelRate(int fuelRate) {
        this.fuelRate = fuelRate;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private int fuelRate;
    private int price;
    private int speed;

    public Modal getModal() {
        return modal;
    }

    public void setModal(Modal modal) {
        this.modal = modal;
    }

    private Modal modal;

    public Car(Modal modal, int fuelRate, int price, int speed)
    {
        this.setFuelRate(fuelRate);
        this.setPrice(price);
        this.setSpeed(speed);
        this.setModal(modal);
    }
}

enum Modal{
    Volvo,
    MAN,
    Mercedes,
    Volkswagen,
    Geely,
    BMW
}