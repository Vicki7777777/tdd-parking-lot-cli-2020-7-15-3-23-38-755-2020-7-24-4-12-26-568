package com.oocl.cultivation.test.story3;

import com.oocl.cultivation.story3.*;
import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.Ticket;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ParkingLotTest {
    @Test
    void should_return_wrong_when_customer_given_usedTicket(){
        //given
        Customer customer = new Customer();
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        ParkingTicket parkingTicket = customer.giveCar(car,smartParkingBoy);
        smartParkingBoy.fetch(parkingTicket);
        //when
        parkingLot.checkTicket(parkingTicket);
        //then
        assertFalse(parkingLot.checkTicket(parkingTicket));
    }
    @Test
    void should_return_null_parkingTicket_when_capacitance_full_given_car(){
        //given
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        //when
        for(int i = 0;i<10;i++)
        {
            parkingLot.putCar(new Car());
        }

        ParkingTicket parkingTicket = parkingLot.putCar(new Car());
        //then
        assertNull(parkingTicket);
    }
}