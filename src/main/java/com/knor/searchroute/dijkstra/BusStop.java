package com.knor.searchroute.dijkstra;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class BusStop {
    private String name;
    private List<BusStop> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    Map<BusStop, Integer> adjacentBusStop = new HashMap<>();

    public void addDestination (BusStop destination, int distance) {
        adjacentBusStop.put(destination, distance);
    }

    public BusStop(String name) {
        this.name = name;
    }
}
