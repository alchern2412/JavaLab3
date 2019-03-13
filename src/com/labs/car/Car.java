package com.labs.car;


import java.util.Comparator;
import java.lang.*;

import com.labs.carexeption.CarFieldsException;
import org.apache.log4j.Logger;

/*Таксопарк. Определить иерархию автомобилей (любых в том числе и
грузовых). Создать таксопарк. Создать управляющего. Его функции:
подсчитать стоимость автопарка, провести сортировку автомобилей парка по
расходу топлива, найти автомобиль в компании, соответствующий заданному
диапазону параметров скорости.
*/
public abstract class Car {      // абстрактный класс

    private static final Logger LOGGER = Logger.getLogger(Car.class.getSimpleName());

    public int getFuelRate() {
        return fuelRate;
    }

    public static Comparator<Car> COMPARE_BY_FUELRATE = new Comparator<Car>(){
        public int compare(Car one, Car other){
            LOGGER.info("Compare by fuelrate");
            return ((Integer)one.fuelRate).compareTo(other.getFuelRate());
        }

    };

    private void setFuelRate(int fuelRate)  throws CarFieldsException{
        if(fuelRate < 0){
            LOGGER.warn("FuelRate is lower then zero!!!");
            throw new CarFieldsException("Расход топлива не может быть отрицательным", fuelRate);
        }
        this.fuelRate = fuelRate;
    }

    public int getPrice(){
        return price;
    }

    private void setPrice(int price) throws CarFieldsException /*исключение*/ {
        if(price < 0){
            LOGGER.warn("Price is lower then zero!!!");
            throw new CarFieldsException("Стоимость автомобиля не может быть отрицательной", price);
        }
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) throws CarFieldsException{
        if(speed <= 0){
            LOGGER.warn("Speed is lower then zero!!!");
            throw new CarFieldsException("Скорость автомобиля не может быть отрицательной или равной 0", speed);
        }
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
        try {

            this.setFuelRate(fuelRate);
            this.setPrice(price);
            this.setSpeed(speed);
            this.setModal(modal);
        }
        catch (CarFieldsException e){
            LOGGER.error("SMTH ERROR: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}

