package com.example.fleetmanagment;

import org.springframework.stereotype.Service;

@Service
public class FleetService {
    // Customers are waiting for their product to arrive to them –
// design an end point given that the truck driver takes 12 hours each day and how would you calculate that time to give the customer
// an estimation of when the product will be delivered.
// It was a two way convo – what kind of end point I should develop,
// what the restful api should look like ect and what the response will be.
// Designing an API that provides travel time for products.

    public float getHoursNeeded(FleetDTO fleetDTO) {
        float totalHourRequired = (float)fleetDTO.getDistance() / fleetDTO.getAverageSpeed();
        int workingHour = Math.min(fleetDTO.getDrivers() * fleetDTO.getWorkingHours(), 24);
        int restHour=(workingHour==24)?0:fleetDTO.getRestHours();
        System.out.println("workingHour"+workingHour+"resHour"+restHour);
        int timeSpent = 0;
        while (totalHourRequired >= 0) {

            if(totalHourRequired - workingHour>0) {
                totalHourRequired = totalHourRequired - workingHour;
                timeSpent += workingHour + restHour;
                System.out.println("timeSpent"+timeSpent+ "Workinghour"+workingHour+"resHour"+restHour);
            }
            else break;
        }
        return timeSpent + totalHourRequired;

    }
}
