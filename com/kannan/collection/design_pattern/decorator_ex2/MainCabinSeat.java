package com.kannan.collection.design_pattern.decorator_ex2;

/**
 * @author Kannan Dharmalingam
 */
public class MainCabinSeat implements FlightSeat {
    public String getFacilities() {
        return "Main Cabin Seat";
    }

    @Override
    public Double getCost() {
        return 500.0;
    }
}
