package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParkingBoyTest {
    @Test
    void should_return_ticket_when_parkingBoy_park_given_car() {
        //given
        Car car = new Car();
        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket ticket = parkingBoy.park(car);
        //then
        assertNotNull(ticket);
    }
    @Test
    void should_return_car_when_parkingBoy_fetch_given_ticket() {
        //given
        ParkingTicket parkingTicket = new ParkingTicket();
        ParkingBoy parkingBoy = new ParkingBoy();
        //when
        Car car = parkingBoy.fetch(parkingTicket);
        //then
        assertNotNull(car);
    }
    @Test
    void should_return_rightCar_when_parkingLot_find_given_tickets(){
        //given
        ParkingTicket parkingTicket01 = new ParkingTicket();
        ParkingTicket parkingTicket02 = new ParkingTicket();
        ParkingBoy parkingBoy = new ParkingBoy();
        //when
        Car car01 = parkingBoy.find(parkingTicket01);
        Car car02 = parkingBoy.find(parkingTicket02);
        //then
        assertEquals("car01",car01);
        assertEquals("car02",car02);
    }
}
