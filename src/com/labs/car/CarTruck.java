package com.labs.car;

import com.labs.carexeption.CarFieldsException;

public class CarTruck extends Car {

    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    private void setTonnage(int tonnage) throws CarFieldsException {
        if(tonnage <= 0){
            throw new CarFieldsException("Тоннаж грузового автомобиля не может быть <= 0", tonnage);
        }

        this.tonnage = tonnage;

    }

    public CarTruck(Modal modal, int fuelRate, int price, int speed, int tonnage) {
        super(modal, fuelRate, price, speed);
        try {
            this.setTonnage(tonnage);
        }
        catch (CarFieldsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
    }

    @Override
    public String toString(){
        return "CarTruck {" + this.getModal() +
                " ; tonnage=" + getTonnage() + " FuelRate=" + this.getFuelRate() +" speed=" + this.getSpeed()  +
                '}';
    }
}
