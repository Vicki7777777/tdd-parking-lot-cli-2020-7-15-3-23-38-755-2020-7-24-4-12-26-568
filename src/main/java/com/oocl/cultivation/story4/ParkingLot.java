package com.oocl.cultivation.story4;
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
            checkCapacitanceMesage();
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

    public boolean isCarExist(Car car){
        return ticket_car.containsValue(car);
    }

    public boolean checkTicket(ParkingTicket parkingTicket) {
        return (parkingTicket != null) && (ticket_car.get(parkingTicket) != null);
    }
    public boolean checkCapacitance(){
        return capacitance < 10;
    }
    public String checkCapacitanceMesage(){
        if(capacitance == 10){
            return "Not enough position.";
        }else {
            return "";
        }
    }

    public int getCapacitance() {
        return capacitance;
    }

    public boolean isTicketExist(ParkingTicket parkingTicket) {
        return ticket_car.containsKey(parkingTicket);
    }
}