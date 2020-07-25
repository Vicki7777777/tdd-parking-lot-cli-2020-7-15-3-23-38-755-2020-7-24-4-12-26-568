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
        String string = "";
        if(!parkingLot.checkTicket(parkingTicket)){
            string = "Unrecognized parking ticket.";
        }
        return string;
    }


}