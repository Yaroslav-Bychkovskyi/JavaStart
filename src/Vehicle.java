public class Vehicle {
    int passengers;
    int fuelcar;
    int mpg;
}

class VehicleDemo{
    public static void main(String [] args){
        Vehicle minival = new Vehicle();
        int range;

        minival.passengers = 7;
        minival.fuelcar = 16;
        minival.mpg = 21;

        range = minival.fuelcar * minival.mpg;
        System.out.println("Мини-фургон может перевезти " + minival.passengers + " пасажиров на росстояние " + range +  " миль");
    }
}
