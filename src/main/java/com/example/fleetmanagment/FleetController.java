package com.example.fleetmanagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FleetController {
        @Autowired
        private FleetService fleetService;

    @PostMapping("/fleets")
    public ResponseEntity<Float>getdays(@RequestBody FleetDTO fleetDTO){
        float fleetHours= fleetService.getHoursNeeded(fleetDTO);
        System.out.println(fleetHours);
        return new ResponseEntity<>(fleetHours, HttpStatus.OK);
    }
}
