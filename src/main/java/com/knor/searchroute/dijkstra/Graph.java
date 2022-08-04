package com.knor.searchroute.dijkstra;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Graph {
    private Set<BusStop> busStops = new HashSet<>();
    public void addNode(BusStop busStopA) {
        busStops.add(busStopA);
    }
}
