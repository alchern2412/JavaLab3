package com.labs.car;


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

    public Car(int fuelRate, int price, int speed)
    {
        this.setFuelRate(fuelRate);
        this.setPrice(price);
        this.setSpeed(speed);
    }
}
