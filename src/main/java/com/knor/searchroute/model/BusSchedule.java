package com.knor.searchroute.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusSchedule {
    private Bus bus;
    private List<LocalTime> schedule;
}
