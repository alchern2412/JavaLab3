package com.labs.carmanager;

import com.labs.carpool.CarPool;
import com.labs.car.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Таксопарк. Определить иерархию автомобилей (любых в том числе и
грузовых). Создать таксопарк. Создать управляющего. Его функции:
подсчитать стоимость автопарка, провести сортировку автомобилей парка по
расходу топлива, найти автомобиль в компании, соответствующий заданному
диапазону параметров скорости.
*/
public class CarManager {

    private CarPool carPool;

    public CarManager(CarPool carPool) {
        this.carPool = carPool;
    }

    public int pricePool()
    {
        int count = carPool.count();
        int price = 0;
        for (int i = 0; i < count; i++) {
            price += carPool.get(i).getPrice();

        }
        return price;
    }

    /**
     * Сортировка по расходу топлива
     */
    public void sortByFuel(){
        Collections.sort(carPool.getCarList(), Car.COMPARE_BY_FUELRATE);
    }
    
    public ArrayList<Car> findCar(int lSpeed, int rSpeed){
        ArrayList<Car> result = new ArrayList<>();
        for (var i :
                carPool.getCarList()) {
            if(i.getSpeed() <= rSpeed && i.getSpeed() >= lSpeed){
                result.add(i);
            }
        }
        return result;
    }
}
