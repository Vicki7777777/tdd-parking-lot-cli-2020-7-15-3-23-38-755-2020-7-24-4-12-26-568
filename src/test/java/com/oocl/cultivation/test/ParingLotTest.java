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
    void should_return_wrong_when_capacitance_full_given_car(){
        //given
        Car car = new Car();
        Customer customer = new Customer();
        for(int i = 0;i<10;i++)
        {
            customer.giveCar(car);
        }
        //when
        ParkingLot parkingLot = new ParkingLot();
        ParkingTicket parkingTicket = customer.giveCar(car);

        //then
        assertEquals(null,parkingTicket);
    }
}
