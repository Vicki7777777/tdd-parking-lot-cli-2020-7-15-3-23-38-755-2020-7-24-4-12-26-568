package com.oocl.cultivation.test.story5;

import com.oocl.cultivation.story5.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartParkingBoyTest {
    @Test
    void should_return_larger_available_position_when_parkingSpace_isdifferent_given_twoCar() {
        //given
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        ParkingLot parkingLot01 = new ParkingLot(10);
        smartParkingBoy.manageParkingLot(parkingLot01);
        Car car01 = new Car();
        ParkingTicket parkingTicket01 = smartParkingBoy.park(car01);
        //when
        ParkingLot parkingLot02 = new ParkingLot(5);
        smartParkingBoy.manageParkingLot(parkingLot02);
        Car car02 = new Car();
        ParkingTicket parkingTicket02 = smartParkingBoy.park(car02);
        //then
        ParkingLot parkingLotTest01 = smartParkingBoy.findParkingLotWithTicket(parkingTicket01);
        ParkingLot parkingLotTest02 = smartParkingBoy.findParkingLotWithTicket(parkingTicket02);
        boolean flag = (parkingLotTest01 == parkingLotTest02);
        assertEquals(false, flag);
    }

    @Test
    void should_return_ticket_when_smartParkingBoy_park_given_car() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        //when
        ParkingTicket ticket = smartParkingBoy.park(car);
        //then
        assertNotNull(ticket);
    }

    @Test
    void should_return_car_when_smartParkingBoy_fetch_given_ticket() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        ParkingTicket parkingTicket = smartParkingBoy.park(car);

        //when
        Car carTest = smartParkingBoy.fetch(parkingTicket);
        //then
        assertNotNull(carTest);
    }

    @Test
    void should_return_rightCar_when_parkingLot_find_given_tickets() {
        //given
        Car car01 = new Car();
        Car car02 = new Car();
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        smartParkingBoy.park(car01);
        ParkingTicket parkingTicket01 = smartParkingBoy.park(car01);
        ParkingTicket parkingTicket02 = smartParkingBoy.park(car02);

        //when
        Car carTest01 = smartParkingBoy.fetch(parkingTicket01);
        Car carTest02 = smartParkingBoy.fetch(parkingTicket02);
        //then
        assertEquals(car01, carTest01);
        assertEquals(car02, carTest02);
    }

    @Test
    void should_return_wrong_when_smartParkingBoy_given_customer_nullTicket() {
        //give
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        ParkingTicket parkingTicket = null;
        smartParkingBoy.park(car);
        //when
        Car carTest = smartParkingBoy.fetch(parkingTicket);
        //then
        assertNull(carTest);
    }
}
