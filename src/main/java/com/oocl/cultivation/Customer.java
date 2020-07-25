package com.oocl.cultivation;

public class Customer {
    Car customerCar = new Car();
    ParkingBoy parkingBoy = new ParkingBoy();
    public ParkingTicket giveCar(Car customerCar){
        ParkingTicket parkingTicket = parkingBoy.park(customerCar);
        return parkingTicket;
    }
    public Car giveTicket(ParkingTicket parkingTicket) {
        Car car = parkingBoy.fetch(parkingTicket);
         return car;
    }
    public boolean checkCar(Car car){
        if (car == getCustomerCar()){
            return true;
        }
        else {
            return false;
        }
    }

    public Car getCustomerCar() {
        return customerCar;
    }
}
