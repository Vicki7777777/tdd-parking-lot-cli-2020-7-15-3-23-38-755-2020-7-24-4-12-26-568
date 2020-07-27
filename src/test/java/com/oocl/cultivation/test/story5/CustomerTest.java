package com.oocl.cultivation.test.story5;


import com.oocl.cultivation.story4.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    void should_return_wrongMesage_when_customer_given_usedTicket() {
        //given
        Customer customer = new Customer();
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        ParkingTicket parkingTicket = customer.giveCar(car, smartParkingBoy);
        //when
        customer.giveTicket(parkingTicket, smartParkingBoy);
        customer.giveTicket(parkingTicket, smartParkingBoy);
        //then
        assertEquals("Unrecognized parking ticket.", customer.checkWrongResult(parkingTicket, smartParkingBoy));

    }

    @Test
    void should_return_wrongMessage_when_customer_given_nullTicket() {
        //given
        Customer customer = new Customer();
        ParkingLot parkingLot = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        //when
        String str = customer.checkWrongResult(null, smartParkingBoy);
        //then
        assertEquals("Please provide your parking ticket.", str);
    }
}