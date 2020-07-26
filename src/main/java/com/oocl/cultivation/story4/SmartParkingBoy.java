package com.oocl.cultivation.story4;

import java.lang.reflect.Array;
import java.util.*;

public class SmartParkingBoy extends ParkingBoy{
    private HashMap<ParkingLot, Integer> parkingLots = new HashMap<>();

    public ParkingTicket park(Car car) {
        ParkingTicket parkingTicket = null;
        boolean isParking = false;
        Integer maxCapacitance = getMaxCapacitance(parkingLots);
        for(ParkingLot parkingLotKey : parkingLots.keySet()){
            if(maxCapacitance == parkingLots.get(parkingLotKey) && parkingLotKey.checkCapacitance()){
                parkingTicket = parkingLotKey.putCar(car);
                isParking = true;
                parkingLots.put(parkingLotKey,parkingLotKey.getCapacitance());
                return parkingTicket;
            }
            if(!isParking){
                parkingLotKey.checkCapacitanceMessage();
            }
        }
        return parkingTicket;
    }

    public ParkingLot findParkingLot(Car car) {
        ParkingLot parkingLot = null;
        for(ParkingLot parkingLotKey : parkingLots.keySet()){
            parkingLot = parkingLotKey;
            if(parkingLot.isCarExist(car)){
                return parkingLot;
            }
        }
        return parkingLot;
    }

    public ParkingLot findParkingLotWithTicket(ParkingTicket parkingTicket){
        ParkingLot parkingLot = null;
        for(ParkingLot parkingLotKey : parkingLots.keySet()){
            parkingLot = parkingLotKey;
            if(parkingLot.isTicketExist(parkingTicket)) {
                return parkingLot;
            }
        }

        return parkingLot;
    }


    public void manageParkingLot(ParkingLot parkingLot) {
        parkingLots.put(parkingLot,parkingLot.getParkingSpace());
    }


    public Car fetch(ParkingTicket parkingTicket) {
        ParkingLot parkingLot = findParkingLotWithTicket(parkingTicket);
        parkingLots.put(parkingLot,parkingLot.getCapacitance());
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

    public Integer getMaxCapacitance(HashMap<ParkingLot, Integer> map){
        if(map == null){
            return null;
        }
        Collection<Integer> capacitance = map.values();
        Object[] capacitanceSort = capacitance.toArray();
        Arrays.sort(capacitanceSort);
        return (Integer) capacitanceSort[capacitanceSort.length-1];
    }

}