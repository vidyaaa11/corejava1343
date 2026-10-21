package com.cao;

public class Mainvehicle {


    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        v1.vehicleId = 101;
        v1.vehicleName = "Swift";
        v1.brand = "Maruti Suzuki";
        v1.color = "White";
        v1.fuelType = "Petrol";
        v1.modelYear = 2025;
        v1.seats = 5;
        v1.price = 800000;
        v1.registrationNo = "MH12AB1234";
        v1.engineCC = 1200;
        v1.ownerName = "sonu";
        v1.vehicleType = "Car";

        v1.display();
    }
}

