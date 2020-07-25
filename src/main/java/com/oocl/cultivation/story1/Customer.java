package com.oocl.cultivation.story1;

public class Customer {
    Car customerCar = new Car();
    ParkingBoy parkingBoy = new ParkingBoy();
    public ParkingTicket giveCar(Car customerCar){
        return parkingBoy.park(customerCar);
    }
    public Car giveTicket(ParkingTicket parkingTicket) {
        return parkingBoy.fetch(parkingTicket);
    }
    public boolean checkCar(Car car){
        return car == getCustomerCar();
    }

    public Car getCustomerCar() {
        return customerCar;
    }
}
