package com.oocl.cultivation.story2;

public class Customer {
    Car customerCar = new Car();
    ParkingTicket parkingTicket = new ParkingTicket();
    public ParkingTicket giveCar(ParkingBoy parkingBoy){
        return parkingBoy.park(customerCar);
    }
    public Car giveTicket(ParkingBoy parkingBoy) {
        return parkingBoy.fetch(parkingTicket);
    }
    public boolean checkCar(Car car){
        return car == getCustomerCar();
    }

    public Car getCustomerCar() {
        return customerCar;
    }

    public String checkWrongResult(ParkingTicket parkingTicket) {
        return "";
    }
}
