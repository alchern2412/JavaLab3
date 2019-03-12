package com.labs.car;

import com.labs.carexeption.CarFieldsException;

public class CarPassenger extends Car {

    public int getCountPassengers() {
        return countPassengers;
    }

    private void setCountPassengers(int countPassengers) throws CarFieldsException {
        if(countPassengers <= 0) throw new CarFieldsException("Число пассажиров должно быть > 0", countPassengers);
        this.countPassengers = countPassengers;
    }

    private int countPassengers;


    public CarPassenger(Modal modal, int fuelRate, int price, int speed, int countPassengers) {
            super(modal, fuelRate, price, speed);
            try {
                this.setCountPassengers(countPassengers);
            }
            catch(CarFieldsException e) {
                System.out.println(e.getMessage());
            }
    }

    @Override
    public String toString() {
        return "CarPassenger {" + this.getModal() +
                " ; countPassengers=" + countPassengers + " FuelRate=" + this.getFuelRate()  +" speed=" + this.getSpeed()  +
                '}';
    }


}

