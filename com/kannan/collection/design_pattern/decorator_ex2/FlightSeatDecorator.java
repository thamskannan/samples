package com.kannan.collection.design_pattern.decorator_ex2;

/**
 * @author Kannan Dharmalingam
 */
public abstract class FlightSeatDecorator implements FlightSeat {
    protected FlightSeat flightSeat;

    public FlightSeatDecorator(FlightSeat flightSeat) {
        this.flightSeat = flightSeat;
    }

    public abstract String getFacilities();

    public abstract Double getCost();
}
