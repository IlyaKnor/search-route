package com.knor.searchroute.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus {
    private String busNumber;
    private int price;
    private LocalTime timeToStart;
}
