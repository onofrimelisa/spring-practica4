package com.bootcamp.spring.dto;

import java.util.List;

public class HouseDTO {
    private String name;
    private String address;
    private Double length;
    private Double width;
    private List<RoomDTO> rooms;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public Double getLength() { return length; }

    public void setLength(Double length) { this.length = length; }

    public Double getWidth() { return width; }

    public void setWidth(Double width) { this.width = width; }

    public List<RoomDTO> getRooms() { return rooms; }

    public void setRooms(List<RoomDTO> rooms) { this.rooms = rooms; }
}
