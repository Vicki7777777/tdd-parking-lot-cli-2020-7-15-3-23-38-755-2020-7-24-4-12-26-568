package com.oocl.cultivation;

public class Customer {
    Car car = new Car();
    ParkingBoy parkingBoy = new ParkingBoy();
    public ParkingTicket giveCar(Car car){
        ParkingTicket parkingTicket = parkingBoy.park(car);
        return parkingTicket;
    }
    public Car giveTicket(ParkingTicket parkingTicket) {
        Car car = parkingBoy.fetch(parkingTicket);
         return car;
    }
    public boolean checkCar(Car car){
        return true;
    }
}
