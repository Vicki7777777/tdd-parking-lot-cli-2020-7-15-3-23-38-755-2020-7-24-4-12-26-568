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
    @Test
    void should_return_wrong_when_customer_given_wrongTicket(){
        //give
        Car car01 = new Car();
        Car car02 = new Car();
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket parkingTicket01 = customer01.giveCar(car01);
        ParkingTicket parkingTicket02 = customer01.giveCar(car02);
        //when
        Car carTest01 = customer01.giveTicket(parkingTicket02);
        Car carTest02 = customer02.giveTicket(parkingTicket01);
        //then
        assertEquals(false,customer01.checkCar(carTest01));
        assertEquals(false,customer02.checkCar(carTest02));
    }

}
