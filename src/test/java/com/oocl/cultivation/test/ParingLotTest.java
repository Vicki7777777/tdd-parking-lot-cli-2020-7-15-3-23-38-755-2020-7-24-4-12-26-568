package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParingLotTest {
    @Test
    void should_return_wrong_when_customer_given_usedTicket(){
        //given
        Customer customer = new Customer();
        Car car = new Car();
        ParkingTicket parkingTicket = customer.giveCar(car);
        ParkingLot parkingLot = new ParkingLot();
        //when
        parkingLot.checkTicket(parkingTicket);
        //then
        assertEquals(false,parkingLot.checkTicket(parkingTicket));
    }
    @Test
    void should_return_null_parkingTicket_when_capacitance_full_given_car(){
        //given
        ParkingLot parkingLot = new ParkingLot();
        //when
        for(int i = 0;i<10;i++)
        {
            parkingLot.putCar(new Car());
        }
        ParkingTicket parkingTicket = parkingLot.putCar(new Car());
        //then
        assertEquals(null,parkingTicket);
    }
}
