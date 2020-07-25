package com.oocl.cultivation.test.story2;

import com.oocl.cultivation.story2.Car;
import com.oocl.cultivation.story2.Customer;
import com.oocl.cultivation.story2.ParkingBoy;
import com.oocl.cultivation.story2.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    void should_return_wrongMesage_when_customer_given_usedTicket(){
        //given
        Customer customer = new Customer();
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket parkingTicket = customer.giveCar(car,parkingBoy);
        //when
        customer.giveTicket(parkingTicket,parkingBoy);
        customer.giveTicket(parkingTicket,parkingBoy);
        //then
        assertEquals("Unrecognized parking ticket.",customer.checkWrongResult(parkingTicket));

    }
    @Test
    void  should_return_wrongMessage_when_customer_given_nullTicket(){
        //given
        Customer customer = new Customer();
        //when
        String str = customer.checkWrongResult(null);
        //then
        assertEquals("Please provide your parking ticket.",str);
    }
}
