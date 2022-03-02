package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    String name;
    Driver driver;
    private int CAPACITY;
    int usedCapacity;
    final double fares;
    double profit;
    private String[] ROUTE;

    String getName(){
        return name;
    }

    void setName(String newName){
        name = newName;
    }

    Driver getDriver(){
        return driver;
    }

    void setDriver(Driver newDriver){
        driver = newDriver;
    }

    int getCAPACITY(){
        return CAPACITY;
    }

    ArrayList getPassenger(){

    }

    int getUsedCapacity(){
        return usedCapacity;
    }

    void setUsedCapacity(int newUsedCapacity){

    }

    double getFares(){
        return fares;
    }

    double getProfit(){
        return profit;
    }


    void setProfit(double newProfit){
        profit = newProfit;
    }
    boolean checkPassengerBalance(Passenger passengerBalance){

    }

    void topUpBalance(double,Passenger balance){

    }

    void dropPassenger(Passenger){

    }

    void proceedOrder(String,Passenger){

    }

    String cancelOrder(Passenger){}
}
