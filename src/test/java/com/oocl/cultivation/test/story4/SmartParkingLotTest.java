package com.oocl.cultivation.test.story4;

import com.oocl.cultivation.story4.Car;
import com.oocl.cultivation.story4.ParkingLot;
import com.oocl.cultivation.story4.ParkingTicket;
import com.oocl.cultivation.story4.SmartParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartParkingLotTest {
    @Test
    void should_return_more_empty_parkingLot_when_vacancy_isDifference_given_twoCar(){
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        ParkingLot parkingLot01 = new ParkingLot();
        ParkingLot parkingLot02 = new ParkingLot();
        smartParkingBoy.manageParkingLot(parkingLot01);
        smartParkingBoy.manageParkingLot(parkingLot02);
        Car car01 = new Car();
        Car car02 = new Car();
        ParkingTicket parkingTicket01 = smartParkingBoy.park(car01);
        ParkingTicket parkingTicke02 = smartParkingBoy.park(car02);
        boolean flag = (smartParkingBoy.findParkingLotWithTicket(parkingTicket01) == smartParkingBoy.findParkingLotWithTicket(parkingTicke02));
        assertFalse(flag);
    }
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
    @Test
    void should_return_ticket_when_smartParkingBoy_park_given_car() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        //when
        ParkingTicket ticket = smartParkingBoy.park(car);
        //then
        assertNotNull(ticket);
    }
    @Test
    void should_return_car_when_smartParkingBoy_fetch_given_ticket() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        ParkingTicket parkingTicket = smartParkingBoy.park(car);

        //when
        Car carTest = smartParkingBoy.fetch(parkingTicket);
        //then
        assertNotNull(carTest);
    }
    @Test
    void should_return_rightCar_when_parkingLot_find_given_tickets(){
        //given
        Car car01 = new Car();
        Car car02 = new Car();
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        smartParkingBoy.park(car01);
        ParkingTicket parkingTicket01 = smartParkingBoy.park(car01);
        ParkingTicket parkingTicket02 = smartParkingBoy.park(car02);

        //when
        Car carTest01 = smartParkingBoy.fetch(parkingTicket01);
        Car carTest02 = smartParkingBoy.fetch(parkingTicket02);
        //then
        assertEquals(car01,carTest01);
        assertEquals(car02,carTest02);
    }
    @Test
    void should_return_wrong_when_smartParkingBoy_given_customer_nullTicket(){
        //give
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.manageParkingLot(parkingLot);
        ParkingTicket parkingTicket = null;
        smartParkingBoy.park(car);
        //when
        Car carTest = smartParkingBoy.fetch(parkingTicket);
        //then
        assertNull(carTest);
    }
}