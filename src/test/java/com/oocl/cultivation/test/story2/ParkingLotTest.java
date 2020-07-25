package com.oocl.cultivation.test.story2;

import com.oocl.cultivation.story2.Car;
import com.oocl.cultivation.story2.Customer;
import com.oocl.cultivation.story2.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {
    @Test
    void should_return_wrongMesage_when_custmer_getTecket_given_nullTecket(){
        //given
        Customer customer = new Customer();
        ParkingTicket parkingTicket =null;
        Car car = customer.giveTicket(parkingTicket);
        //when
        String str = "";
        if(car == null){
            str = customer.checkWrongResult(parkingTicket);
        }
        //then
        assertEquals("Unrecognized parking ticket.",str);
    }

}
