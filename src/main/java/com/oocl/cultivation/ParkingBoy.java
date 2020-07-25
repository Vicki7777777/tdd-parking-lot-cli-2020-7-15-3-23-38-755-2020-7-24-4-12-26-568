package com.oocl.cultivation;

public class ParkingBoy {
    ParkingLot parkingLot = new ParkingLot();
    public ParkingTicket park(Car car) {
        return parkingLot.putCar(car);
    }

    public Car fetch(ParkingTicket parkingTicket) {

        return parkingLot.findCar(parkingTicket);
    }


}
