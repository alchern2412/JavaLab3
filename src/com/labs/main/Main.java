package com.labs.main;

import com.labs.car.Car;
import com.labs.car.CarPassenger;
import com.labs.car.CarTruck;
import com.labs.car.Modal;
import com.labs.carexeption.CarFieldsException;
import com.labs.carmanager.CarManager;
import com.labs.carpool.CarPool;

import java.util.ArrayList;



/*Таксопарк. Определить иерархию автомобилей (любых в том числе и
грузовых). Создать таксопарк. Создать управляющего. Его функции:
подсчитать стоимость автопарка, провести сортировку автомобилей парка по
расходу топлива, найти автомобиль в компании, соответствующий заданному
диапазону параметров скорости.
*/
public class Main {

    public static void main(String[] args) {
try {
    // пассажирские автомобили
    Car car1 = new CarPassenger(Modal.BMW, 7, 28000, 220, 5);
    Car car2 = new CarPassenger(Modal.Geely, 5, 8000, 200, 5);
    Car car3 = new CarPassenger(Modal.Volkswagen, 4, 15000, 250, 6);
    // грузовые автомобили
    Car car4 = new CarTruck(Modal.MAN, 25, 30000, 150, 10);
    Car car5 = new CarTruck(Modal.Volvo, 29, 35000, 160, 15);
    Car car6 = new CarTruck(Modal.Mercedes, 24, 40000, 170, 13);

    // лист автомобилей
    ArrayList<Car> cars = new ArrayList<>();

    //  добавляем в лист
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.add(car4);
    cars.add(car5);
    cars.add(car6);

    //  таксопарк
    CarPool carPool = new CarPool(cars);

    // менеджер таксопарка
    CarManager manager = new CarManager(carPool);

    // вывод информации об автомобилях
    for (int i = 0; i < carPool.count(); i++) {
        System.out.println(carPool.get(i).getFuelRate());
    }
    //вывод стоимости всего таксопарка
    System.out.println("\nСтоимость всего таксопарка  " + manager.pricePool() + '\n');

    // сортировка по расходу топлива
    manager.sortByFuel();

    // еще раз вывод всех автомобилей
    for (int i = 0; i < carPool.count(); i++) {
        System.out.println(carPool.get(i).getFuelRate());
    }

    System.out.println("\nПоиск автомобилей по значениям скорости:");

    ArrayList<Car> findcarbyspeed = manager.findCar(160, 210);
    for (Car i :
            findcarbyspeed) {
        System.out.println(i.toString());
    }


}
catch (Exception e){
    System.out.println(e.getMessage());
}

    }
}
