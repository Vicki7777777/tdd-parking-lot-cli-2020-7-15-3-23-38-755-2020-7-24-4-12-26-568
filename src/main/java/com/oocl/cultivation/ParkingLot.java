package com.oocl.cultivation;

import java.util.HashMap;
import java.util.HashSet;

public class ParkingLot {
    private HashMap<ParkingTicket,Car> ticket_car = new HashMap<>();

    public ParkingTicket putCar(Car car){
        ParkingTicket getTicket = new ParkingTicket();
        ticket_car.put(getTicket,car);
        return getTicket;
    }

    public Car findCar(ParkingTicket parkingTicket) {
        Car findResultCar = ticket_car.get(parkingTicket);
        return findResultCar;
    }

    public boolean checkTicket(ParkingTicket parkingTicket) {
        return true;
    }
}
