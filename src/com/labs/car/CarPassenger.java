package com.labs.car;

import com.labs.carexeption.CarFieldsException;
import com.labs.main.Main;
import org.apache.log4j.Logger;

public class CarPassenger extends Car {

    private static final Logger LOGGER = Logger.getLogger(CarPassenger.class.getSimpleName());

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
            LOGGER.info("Create CarPassenger");
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

