package com.oocl.cultivation.story5;

public class ParkingBoy {
    private static final String PLEASE_PROVIDE_YOUR_PARKING_TICKET = "Please provide your parking ticket.";
    private static final String UNRECOGNIZED_PARKING_TICKET = "Unrecognized parking ticket.";
    ParkingLot parkingLot = new ParkingLot(10);

    public ParkingTicket park(Car car, ParkingLot parkingLot) {
        return parkingLot.putCar(car);
    }

    public Car fetch(ParkingTicket parkingTicket, ParkingLot parkingLot) {
        return parkingLot.findCar(parkingTicket);
    }

    public String checkTicketMessage(ParkingTicket parkingTicket) {
        String errorStr = "";
        if (parkingTicket == null) {
            errorStr = PLEASE_PROVIDE_YOUR_PARKING_TICKET;
            return errorStr;
        }
        if (!parkingLot.checkTicket(parkingTicket)) {
            errorStr = UNRECOGNIZED_PARKING_TICKET;
            return errorStr;
        }
        return errorStr;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }
}