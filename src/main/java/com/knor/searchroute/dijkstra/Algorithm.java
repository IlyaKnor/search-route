package com.knor.searchroute.dijkstra;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Algorithm {
    public Graph pathFinder(Graph graph, BusStop source) {
        source.setDistance(0);

        Set<BusStop> settledBusStops = new HashSet<>();
        Set<BusStop> unsettledBusStops = new HashSet<>();

        unsettledBusStops.add(source);

        while (unsettledBusStops.size() != 0) {
            BusStop currentBusStop = getLowestDistanceToBusStop(unsettledBusStops);
            unsettledBusStops.remove(currentBusStop);
            for (Map.Entry <BusStop, Integer> adjacencyPair : currentBusStop.getAdjacentBusStop().entrySet()) {
                BusStop adjacencyBusStop = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledBusStops.contains(adjacencyBusStop)) {
                    calculateMinimumDistance(adjacencyBusStop, edgeWeight, currentBusStop);
                    unsettledBusStops.add(adjacencyBusStop);
                }
            }
            settledBusStops.add(currentBusStop);
        }
        return  graph;
    }

    private BusStop getLowestDistanceToBusStop(Set<BusStop> unsettledBusStops) {
        BusStop lowestDistanceBusStop = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (BusStop busStop : unsettledBusStops) {
            int nodeDistance = busStop.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceBusStop = busStop;
            }
        }
        return lowestDistanceBusStop;
    }

    private void calculateMinimumDistance(BusStop evaluationBusStop, Integer edgeWeigh, BusStop sourceBusStop) {
        Integer sourceDistance = sourceBusStop.getDistance();
        if (sourceDistance + edgeWeigh < evaluationBusStop.getDistance()) {
            evaluationBusStop.setDistance(sourceDistance + edgeWeigh);
            LinkedList<BusStop> shortestPath = new LinkedList<>(sourceBusStop.getShortestPath());
            shortestPath.add(sourceBusStop);
            evaluationBusStop.setShortestPath(shortestPath);
        }
    }
}
