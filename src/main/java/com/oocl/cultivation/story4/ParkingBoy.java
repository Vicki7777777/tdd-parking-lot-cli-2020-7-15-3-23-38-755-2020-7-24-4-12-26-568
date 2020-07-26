package com.oocl.cultivation.story4;

public class ParkingBoy {
    ParkingLot parkingLot = new ParkingLot(10);
    public ParkingTicket park(Car car,ParkingLot parkingLot) {
        return parkingLot.putCar(car);
    }

    public Car fetch(ParkingTicket parkingTicket,ParkingLot parkingLot) {
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