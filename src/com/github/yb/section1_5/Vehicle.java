package com.github.yb.section1_5;

public class Vehicle {
    int passengers;
    int fuelcar;
    int mpg;
    int range (){
        return fuelcar * mpg;
    }
}

class VehicleDemo{
    public static void main(String [] args){
        Vehicle minival = new Vehicle();
        int range;

        minival.passengers = 7;
        minival.fuelcar = 16;
        minival.mpg = 21;

        range = minival.range();
        System.out.println("Мини-фургон может перевезти " + minival.passengers + " пасажиров на росстояние " + range +  " миль");
    }

}
