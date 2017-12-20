package com.kannan.collection.design_pattern.decorator_ex2.decorator;

import com.kannan.collection.design_pattern.decorator_ex2.FlightSeat;
import com.kannan.collection.design_pattern.decorator_ex2.FlightSeatDecorator;

/**
 * @author Kannan Dharmalingam
 */
public class WiFi extends FlightSeatDecorator {
    public WiFi(FlightSeat flightSeat) {
        super(flightSeat);
    }

    @Override
    public String getFacilities() {
        return this.flightSeat.getFacilities() + "\nWiFi";
    }

    @Override
    public Double getCost() {
        return this.flightSeat.getCost() + 10.0;
    }
}
