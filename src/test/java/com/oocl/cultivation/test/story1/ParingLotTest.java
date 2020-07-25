package com.oocl.cultivation.test.story1;

import com.oocl.cultivation.story1.Car;
import com.oocl.cultivation.story1.Customer;
import com.oocl.cultivation.story1.ParkingLot;
import com.oocl.cultivation.story1.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertFalse(parkingLot.checkTicket(parkingTicket));
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
        assertNull(parkingTicket);
    }
}
