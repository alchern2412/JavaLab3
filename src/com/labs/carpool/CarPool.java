package com.labs.carpool;

import java.util.ArrayList;

import com.labs.car.*;
import com.labs.carmanager.CarManager;
import org.apache.log4j.Logger;

public class CarPool {

    private static final Logger LOGGER = Logger.getLogger(CarPool.class.getSimpleName());

    // стандартная коллекция ArrayList<>
    private ArrayList<Car> carList = new ArrayList<Car>();

    public CarPool(ArrayList<Car> carList) {
        this.carList = carList;
        LOGGER.info("CarList is created");

    }

    public CarPool(Car firstcar){
        carList.add(firstcar);
        LOGGER.info("CarList is created with first car: " + firstcar.getModal());
    }

    public int count(){
        return carList.size();
    }

    public ArrayList<Car> getCarList() {
        return carList;
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
        LOGGER.info("Remove " + index + " car from CarPool");
    }

    /**
     * Удаление автомобиля (объекта) из таксопарка
     * @param car
     */
    public void remove(Car car){
        carList.remove(car);
        LOGGER.info("Remove " + car.getModal() + " car from CarPool");
    }

}
