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
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket parkingTicket = parkingBoy.park(car);

        //when
        Car carTest = parkingBoy.fetch(parkingTicket);
        //then
        assertNotNull(carTest);
    }
    @Test
    void should_return_rightCar_when_parkingLot_find_given_tickets(){
        //given
        Car car01 = new Car();
        Car car02 = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        parkingBoy.park(car01);
        ParkingTicket parkingTicket01 = parkingBoy.park(car01);
        ParkingTicket parkingTicket02 = parkingBoy.park(car02);

        //when
        Car carTest01 = parkingBoy.fetch(parkingTicket01);
        Car carTest02 = parkingBoy.fetch(parkingTicket02);
        //then
        assertEquals(car01,carTest01);
        assertEquals(car02,carTest02);
    }
    @Test
    void should_return_wrong_when_parkingboy_given_customer_nullTicket(){
        //give
        Car car = new Car();
        ParkingTicket parkingTicket = null;
        ParkingBoy parkingBoy = new ParkingBoy();
        parkingBoy.park(car);
        //when
        Car carTest = parkingBoy.fetch(parkingTicket);
        //then
        assertEquals(null,carTest);
    }

}
