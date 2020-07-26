package com.oocl.cultivation.story5;

public class Customer {
    Car customerCar = new Car();
    public ParkingTicket giveCar(Car car,SmartParkingBoy smartParkingBoy){
        return smartParkingBoy.park(car);
    }
    public Car giveTicket(ParkingTicket parkingTicket,SmartParkingBoy smartParkingBoy) {
        return smartParkingBoy.fetch(parkingTicket);
    }
    public boolean checkCar(Car car){
        return car == getCustomerCar();
    }

    public Car getCustomerCar() {
        return customerCar;
    }

    public String checkWrongResult(ParkingTicket parkingTicket,SmartParkingBoy smartParkingBoy) {
        return smartParkingBoy.checkTicketMessage(parkingTicket);
    }
}