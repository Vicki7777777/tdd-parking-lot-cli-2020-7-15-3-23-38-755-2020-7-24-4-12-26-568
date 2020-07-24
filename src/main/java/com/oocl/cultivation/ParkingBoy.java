package com.oocl.cultivation;

public class ParkingBoy {
    ParkingLot parkingLot = new ParkingLot();
    public ParkingTicket park(Car car) {
        ParkingTicket parkingTicket = parkingLot.putCar(car);
        return parkingTicket;
    }

    public Car fetch(ParkingTicket parkingTicket) {
        Car car = parkingLot.findCar(parkingTicket);
        return car;
    }


}
