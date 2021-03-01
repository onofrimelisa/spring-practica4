package com.bootcamp.spring.dto;

import java.util.HashMap;

public class ResponseHouseDTO {
    private Double squareMeters;
    private double cost;
    private RoomDTO biggestRoom;
    private HashMap<String, Double> squareMetersPerRoom;

    public Double getSquareMeters() { return squareMeters; }

    public void setSquareMeters(Double squareMeters) { this.squareMeters = squareMeters; }

    public double getCost() { return cost; }

    public void setCost(double cost) { this.cost = cost; }

    public RoomDTO getBiggestRoom() { return biggestRoom; }

    public void setBiggestRoom(RoomDTO biggestRoom) { this.biggestRoom = biggestRoom; }

    public HashMap<String, Double> getSquareMetersPerRoom() { return squareMetersPerRoom; }

    public void setSquareMetersPerRoom(HashMap<String, Double> squareMetersPerRoom) {
        this.squareMetersPerRoom = squareMetersPerRoom;
    }
}
