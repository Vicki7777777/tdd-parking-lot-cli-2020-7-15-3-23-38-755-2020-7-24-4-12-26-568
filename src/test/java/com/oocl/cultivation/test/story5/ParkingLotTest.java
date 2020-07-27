package com.oocl.cultivation.test.story5;

import com.oocl.cultivation.story5.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void should_return_wrong_when_customer_given_usedTicket() {
        //given
        Customer customer = new Customer();
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        ParkingTicket parkingTicket = customer.giveCar(car, smartParkingBoy);
        smartParkingBoy.fetch(parkingTicket);
        //when
        parkingLot.checkTicket(parkingTicket);
        //then
        assertFalse(parkingLot.checkTicket(parkingTicket));
    }

    @Test
    void should_return_null_parkingTicket_when_capacitance_full_given_car() {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        //when
        for (int i = 0; i < 10; i++) {
            parkingLot.putCar(new Car());
        }

        ParkingTicket parkingTicket = parkingLot.putCar(new Car());
        //then
        assertNull(parkingTicket);
    }

    @Test
    void  should_return_true_when_isCarExite_given_carExit(){
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        //when
        parkingLot.putCar(car);
        //then
        assertTrue(parkingLot.isCarExist(car));
    }
}