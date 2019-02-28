package com.labs.carpool;

import java.util.ArrayList;

import com.labs.car.*;
import com.labs.carmanager.CarManager;

public class CarPool {
    private ArrayList<Car> carList = new ArrayList<Car>();

    public CarPool(ArrayList<Car> carList) {
        this.carList = carList;

    }

    public CarPool(Car firstcar){
        carList.add(firstcar);
    }

    public int count(){
        return carList.size();
    }

    public void add(Car obj){
        carList.add(obj);
    }

    public void set(int index, Car car){
        carList.set(index, car);
    }

    public Car get(int index){
        return carList.get(index);
    }

    /**
     * Удаление автомобиля из таксопарка по индексу
     * @param index
     */
    public void remove(int index) {
        carList.remove(index);
    }

    /**
     * Удаление автомобиля (объекта) из таксопарка
     * @param car
     */
    public void remove(Car car){
        carList.remove(car);
    }

}
