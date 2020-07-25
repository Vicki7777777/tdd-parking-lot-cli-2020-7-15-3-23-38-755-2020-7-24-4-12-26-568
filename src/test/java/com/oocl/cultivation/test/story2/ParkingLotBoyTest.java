package com.oocl.cultivation.test.story2;

import com.oocl.cultivation.story2.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotBoyTest {
    @Test
    void should_return_wrongMesage_when_packingBoy_given_nullTecket(){
        //given
        Customer customer = new Customer();
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingLot parkingLot = new ParkingLot();
        ParkingTicket parkingTicket = parkingBoy.park(null,parkingLot);
        //when
        String str = customer.checkWrongResult(parkingTicket);
        //then
        assertEquals("Unrecognized parking ticket.",str);
    }
    @Test
    void should_return_wrongMessage_when_packingBoy_fetch_given_fullCapacitance(){
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingLot parkingLot = new ParkingLot();
        for(int i = 0;i<10;i++)
        {
            parkingBoy.park(new Car(),parkingLot);
        }
        //when

        parkingBoy.park(new Car(),parkingLot);
        String wrongMessage = parkingLot.checkCapacitanceMesage();
        //then

        assertEquals("Not enough position.",wrongMessage);
    }


}
