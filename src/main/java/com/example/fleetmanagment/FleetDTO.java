package com.example.fleetmanagment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FleetDTO {
    @Id
    private long id;
    private int drivers;
    private int distance;
    private int averageSpeed;
    private int workingHours;
    private int restHours;


}
