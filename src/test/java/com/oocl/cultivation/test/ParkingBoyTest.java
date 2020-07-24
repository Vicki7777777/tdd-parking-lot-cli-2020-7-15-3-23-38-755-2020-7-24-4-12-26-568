package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingTicket;
import org.junit.jupiter.api.Test;

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
        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = parkingBoy.fetch(parkingTicket);
        //then
        assertNotNull(car);
    }
}
