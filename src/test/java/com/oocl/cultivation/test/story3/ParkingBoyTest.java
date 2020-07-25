package com.oocl.cultivation.test.story3;

import com.oocl.cultivation.story3.Car;
import com.oocl.cultivation.story3.ParkingBoy;
import com.oocl.cultivation.story3.ParkingLot;
import com.oocl.cultivation.story3.SmartParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingBoyTest {
    @Test
    void should_return_put_car_to_another_parkingLot_when_firstParkingLoutFull_give_multipleCar(){
        //given

        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        ParkingLot parkingLot01 = new ParkingLot();
        ParkingLot parkingLot02 = new ParkingLot();
        smartParkingBoy.manageParkingLot(parkingLot01);
        smartParkingBoy.manageParkingLot(parkingLot02);
        for(int i = 0;i<parkingLot01.getCapacitance();i++)
        {
            smartParkingBoy.park(new Car());
        }

        //when
        Car car = new Car();
        smartParkingBoy.park(new Car());
        //then
        assertEquals(parkingLot02,smartParkingBoy.findParkingLot(car));

    }
}
