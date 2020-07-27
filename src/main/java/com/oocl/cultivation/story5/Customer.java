package com.oocl.cultivation.story5;

public class Customer {

    public ParkingTicket giveCar(Car car, SmartParkingBoy smartParkingBoy) {
        return smartParkingBoy.park(car);
    }

    public Car giveTicket(ParkingTicket parkingTicket, SmartParkingBoy smartParkingBoy) {
        return smartParkingBoy.fetch(parkingTicket);
    }

    public String checkWrongResult(ParkingTicket parkingTicket, SmartParkingBoy smartParkingBoy) {
        return smartParkingBoy.checkTicketMessage(parkingTicket);
    }
}