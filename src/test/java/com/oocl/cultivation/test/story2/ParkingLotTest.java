package com.oocl.cultivation.test.story2;

import com.oocl.cultivation.story2.Car;
import com.oocl.cultivation.story2.Customer;
import com.oocl.cultivation.story2.ParkingBoy;
import com.oocl.cultivation.story2.ParkingTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {
    @Test
    void should_return_wrongMesage_when_packingBoy_given_nullTecket(){
        //given
        Customer customer = new Customer();
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket parkingTicket = parkingBoy.park(null);
        //when
        String str = customer.checkWrongResult(parkingTicket);
        //then
        assertEquals("Unrecognized parking ticket.",str);
    }

}
