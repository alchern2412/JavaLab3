package com.labs.carmanager;

import com.labs.carpool.CarPool;

public class CarManager {

    private CarPool carPool;

    public CarManager(CarPool carPool) {
        this.carPool = carPool;
    }

    public int poolPrice()
    {
        int count = carPool.count();
        int price = 0;
        for (int i = 0; i < count; i++) {
            price += carPool.get(i).getPrice();

        }
        return price;
    }
}
