package com.oocl.cultivation.story2;

public class ParkingBoy {
    ParkingLot parkingLot = new ParkingLot();
    public ParkingTicket park(Car car) {
        return parkingLot.putCar(car);
    }

    public Car fetch(ParkingTicket parkingTicket) {
        return parkingLot.findCar(parkingTicket);
    }

    public String checkTicketMessage(ParkingTicket parkingTicket){
        String errorStr = "";
        if(parkingTicket == null){
            errorStr = "Please provide your parking ticket.";
            return errorStr;
        }
        if(!parkingLot.checkTicket(parkingTicket)){
            errorStr = "Unrecognized parking ticket.";
            return errorStr;
        }
        return errorStr;
    }


}