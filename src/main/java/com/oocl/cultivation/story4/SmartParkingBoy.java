package com.oocl.cultivation.story4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SmartParkingBoy extends ParkingBoy{
    private List<ParkingLot>parkingLots = new ArrayList<ParkingLot>();;
    public ParkingTicket park(Car car) {
        ParkingTicket parkingTicket = null;
        boolean isParking = false;
        for(int i=0; i<parkingLots.size();i++){
            ParkingLot parkingLot = parkingLots.get(i);
            if (parkingLot.checkCapacitance()){
                parkingTicket = parkingLot.putCar(car);
                isParking = true;
            }
            if(!isParking){
                parkingLot.checkCapacitanceMesage();
            }
        }
        return parkingTicket;
    }

    public ParkingLot findParkingLot(Car car) {
        ParkingLot parkingLot = null;
        for(int i=0;i<parkingLots.size();i++){
            parkingLot = parkingLots.get(i);
            if(parkingLot.isCarExist(car)){
                return parkingLot;
            }
        }
        return parkingLot;
    }

    public ParkingLot findParkingLotWithTicket(ParkingTicket parkingTicket){
        ParkingLot parkingLot = null;
        for(int i=0;i<parkingLots.size();i++){
            parkingLot = parkingLots.get(i);
            if(parkingLot.isTicketExist(parkingTicket)){
                return parkingLot;
            }
        }
        return parkingLot;
    }

    public void manageParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }


    public Car fetch(ParkingTicket parkingTicket) {
        ParkingLot parkingLot = findParkingLotWithTicket(parkingTicket);
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