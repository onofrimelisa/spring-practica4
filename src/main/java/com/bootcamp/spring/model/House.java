package com.bootcamp.spring.model;

import com.bootcamp.spring.dto.RoomDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class House {
    private String name;
    private String address;
    private Double length;
    private Double width;
    private List<Room> rooms;

    public House(String name, String address, Double length, Double width) {
        this.name = name;
        this.address = address;
        this.length = length;
        this.width = width;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room r){
        this.rooms.add(r);
    }
    
    public Double calculateSquareMeters() {
        return this.rooms
                .stream()
                .mapToDouble(room ->(room.getSquareMeters() + room.getSquareMeters()))
                .reduce(Double::sum)
                .orElse(0);
    }

    public Double calculateCost() {
        final Double costPerSquareMeter = new Double(800d);
        return (this.calculateSquareMeters() * costPerSquareMeter);
    }

    public Room getBiggestRoom() {
        Room biggestRoom = null;
        Double max = new Double(0d);

        for (Room room :
                this.getRooms()) {
            Double squareMeters = room.getSquareMeters();
            if (squareMeters > max) {
                max = squareMeters;
                biggestRoom = room;
            }
        }

        return  biggestRoom;
    }
}
