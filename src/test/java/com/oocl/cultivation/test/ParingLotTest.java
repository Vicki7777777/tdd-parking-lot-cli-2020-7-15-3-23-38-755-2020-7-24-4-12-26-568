package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.Customer;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParingLotTest {
    @Test
    void should_return_wrong_when_customer_given_usedTicket(){
        //give
        Customer customer = new Customer();
        Car car = new Car();
        ParkingTicket parkingTicket = customer.giveCar(car);
        ParkingLot parkingLot = new ParkingLot();
        //when
        parkingLot.checkTicket(parkingTicket);
        //then
        assertEquals(false,parkingLot.checkTicket(parkingTicket));
    }
}
