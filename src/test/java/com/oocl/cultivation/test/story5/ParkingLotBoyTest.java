package com.oocl.cultivation.test.story5;

import com.oocl.cultivation.story5.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotBoyTest {
    @Test
    void should_return_wrongMessage_when_packingBoy_fetch_given_fullCapacitance(){
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingLot parkingLot = new ParkingLot(10);
        for(int i = 0;i<10;i++)
        {
            parkingBoy.park(new Car(),parkingLot);
        }
        //when

        parkingBoy.park(new Car(),parkingLot);
        String wrongMessage = parkingLot.checkCapacitanceMessage();
        //then

        assertEquals("Not enough position.",wrongMessage);
    }


}