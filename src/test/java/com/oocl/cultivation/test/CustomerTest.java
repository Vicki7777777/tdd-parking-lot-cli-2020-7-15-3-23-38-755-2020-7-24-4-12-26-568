package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.Customer;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void should_return_wrong_when_customer_given_nullTicket(){
        //give
        Customer customer = new Customer();
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket parkingTicket = null;

        //when
        Car car = customer.giveTicket(parkingTicket);
        //then
        assertEquals(null,car);
    }

}
