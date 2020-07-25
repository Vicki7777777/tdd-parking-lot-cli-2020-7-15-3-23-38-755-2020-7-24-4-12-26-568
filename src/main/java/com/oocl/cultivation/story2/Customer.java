package com.oocl.cultivation.story2;

public class Customer {
    Car customerCar = new Car();
    ParkingTicket parkingTicket = new ParkingTicket();
    ParkingBoy parkingBoy = new ParkingBoy();
    ParkingLot parkingLot = new ParkingLot();
    public ParkingTicket giveCar(Car car,ParkingBoy parkingBoy,ParkingLot parkingLot){
        return parkingBoy.park(customerCar,parkingLot);
    }
    public Car giveTicket(ParkingTicket parkingTicket,ParkingBoy parkingBoy) {
        return parkingBoy.fetch(parkingTicket,parkingLot);
    }
    public boolean checkCar(Car car){
        return car == getCustomerCar();
    }

    public Car getCustomerCar() {
        return customerCar;
    }

    public String checkWrongResult(ParkingTicket parkingTicket) {
        return parkingBoy.checkTicketMessage(parkingTicket);
    }
}
