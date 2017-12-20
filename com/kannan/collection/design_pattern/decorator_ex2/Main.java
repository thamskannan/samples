package com.kannan.collection.design_pattern.decorator_ex2;

import com.kannan.collection.design_pattern.decorator_ex2.decorator.HeadPhone;
import com.kannan.collection.design_pattern.decorator_ex2.decorator.LiveTV;
import com.kannan.collection.design_pattern.decorator_ex2.decorator.WiFi;

/**
 * @author Kannan Dharmalingam
 */
public class Main {
    public static void main(String[] args) {
        FlightSeat mainCabinSeat = new WiFi(new HeadPhone(new LiveTV(new MainCabinSeat())));

        System.out.println("Chosen Facilities for your seat:");
        System.out.println(mainCabinSeat.getFacilities());
        System.out.println("Total Cost:" + mainCabinSeat.getCost());
    }
}

/* Output:
Chosen Facilities for your seat:
Main Cabin Seat
Live TV
Head Phones
WiFi
Total Cost:522.0
*/