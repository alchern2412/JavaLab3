package com.labs.carexeption;

public class CarFieldsException extends Exception { // наследуется от Exception

    private int number;

    public int getNumber() {
        return number;
    }

    public CarFieldsException(String message, int number){
        super(message);
        this.number = number;
    }
}
