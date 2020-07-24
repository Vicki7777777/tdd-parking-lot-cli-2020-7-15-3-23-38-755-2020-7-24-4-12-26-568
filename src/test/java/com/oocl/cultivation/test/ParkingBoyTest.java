package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParkingBoyTest {
    @Test
    void should_return_ticket_when_parkingBoy_parking_given_car() {
        //given
        Car car = new Car();
        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket ticket = parkingBoy.parking(car);
        //then
        assertNotNull(ticket);
    }
}
