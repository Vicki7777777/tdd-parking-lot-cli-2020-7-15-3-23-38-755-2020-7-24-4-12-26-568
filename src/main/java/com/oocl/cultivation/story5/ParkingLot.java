package com.oocl.cultivation.story5;

import java.util.HashMap;

public class ParkingLot {
    private final HashMap<ParkingTicket, Car> ticket_car = new HashMap<>();
    private Integer usedCapacitance = 0;
    private Integer parkingSpaceSum = 0;

    public ParkingLot(int space){
        parkingSpaceSum = space;
    }

    public ParkingTicket putCar(Car car){
        if(checkCapacitance()){
            ParkingTicket getTicket = new ParkingTicket();
            ticket_car.put(getTicket,car);
            usedCapacitance++;
            return getTicket;
        }
        else {
            checkCapacitanceMessage();
            return null;
        }

    }

    public Car findCar(ParkingTicket parkingTicket) {
        Car findResultCar;
        if(checkTicket(parkingTicket)){
            findResultCar = ticket_car.get(parkingTicket);
            ticket_car.remove(parkingTicket);
            usedCapacitance--;
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
        return getParkingSpace() > 0;
    }
    public String checkCapacitanceMessage(){
        if(getParkingSpace() == 0){
            return "Not enough position.";
        }else {
            return "";
        }
    }

    public Integer getCapacitance() {
        return usedCapacitance;
    }
    public Integer getParkingSpace() {
        return (parkingSpaceSum-usedCapacitance);
    }

    public boolean isTicketExist(ParkingTicket parkingTicket) {
        return ticket_car.containsKey(parkingTicket);
    }

    public double calculateAvailable(){
        double parkingSpace = getParkingSpace();
        return parkingSpace/parkingSpaceSum;
    }
}