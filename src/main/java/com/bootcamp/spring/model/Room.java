package com.bootcamp.spring.model;

public class Room {
    private Double width;
    private Double length;
    private String name;
    private Double squareMeters;

    public Room(Double width, Double length, String name) {
        this.width = width;
        this.length = length;
        this.name = name;
        this.squareMeters = this.length * this.width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getSquareMeters() { return squareMeters; }
}
