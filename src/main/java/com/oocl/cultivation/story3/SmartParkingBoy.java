package com.oocl.cultivation.story3;

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

    public void manageParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }


}
