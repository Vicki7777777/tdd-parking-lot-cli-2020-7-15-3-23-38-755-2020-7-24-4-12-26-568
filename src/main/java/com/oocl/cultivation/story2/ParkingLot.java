package com.oocl.cultivation.story2;

import java.util.HashMap;

public class ParkingLot {
    private final HashMap<ParkingTicket, Car> ticket_car = new HashMap<>();
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
        Car findResultCar;
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
        return (parkingTicket != null) && (ticket_car.get(parkingTicket) != null);
    }
    public boolean checkCapacitance(){
        return capacitance < 10;
    }


}