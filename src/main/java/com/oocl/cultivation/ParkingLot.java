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
        Car findResultCar = new Car();
        if(checkTicket(parkingTicket)){
            findResultCar = ticket_car.get(parkingTicket);
            ticket_car.remove(parkingTicket);
            return findResultCar;
        }else {
            return null;
        }
    }

    public boolean checkTicket(ParkingTicket parkingTicket) {
        if((parkingTicket == null) || (ticket_car.get(parkingTicket) == null)){
            return false;
        }else{
            return true;
        }
    }

    public HashMap<ParkingTicket, Car> getTicket_car() {
        return ticket_car;
    }

    public void setTicket_car(HashMap<ParkingTicket, Car> ticket_car) {
        this.ticket_car = ticket_car;
    }
}
