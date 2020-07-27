package com.oocl.cultivation.test.story5;

import com.oocl.cultivation.story5.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    @Test
    void should_return_rightTicket_when_parkingBoy_park_given_rightParkingCar(){
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        //when
        ParkingTicket parkingTicket = parkingBoy.park(car,parkingLot);
        //then
        assertNotNull(parkingTicket);
    }

    @Test
    void should_return_rightCar_when_parkingBoy_fetch_given_rightTicket(){
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car,parkingLot);
        //when
        Car carTest = parkingBoy.fetch(parkingTicket,parkingLot);
        //then
        assertEquals(car,carTest);
    }

    @Test
    void should_return_wrongMessage_when_parkingBoy_given_nullTicket(){
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket parkingTicket = null;
        //when
        parkingBoy.fetch(parkingTicket,parkingLot);
        String message = parkingBoy.checkTicketMessage(parkingTicket);
        //then
        assertEquals("Please provide your parking ticket.",message);
    }
}