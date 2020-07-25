package com.oocl.cultivation;

import java.util.HashMap;
import java.util.HashSet;

public class ParkingLot {
    private final HashMap<ParkingTicket,Car> ticket_car = new HashMap<>();
    private int capacitance = 0;

    public ParkingTicket putCar(Car car){
        if(checkCapacitance()){
            ParkingTicket getTicket = new ParkingTicket();
            ticket_car.put(getTicket,car);
            capacitance++;
            return getTicket;
        }
        else {
            return null;
        }

    }

    public Car findCar(ParkingTicket parkingTicket) {
        Car findResultCar = new Car();
        if(checkTicket(parkingTicket)){
            findResultCar = ticket_car.get(parkingTicket);
            ticket_car.remove(parkingTicket);
            capacitance--;
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
    public boolean checkCapacitance(){
        if(capacitance >= 10)
        {
            return false;
        }
        else {
            return true;
        }
    }

    public HashMap<ParkingTicket, Car> getTicket_car() {
        return ticket_car;
    }

}
