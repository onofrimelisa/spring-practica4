package com.bootcamp.spring.dto;

public class RoomDTO {
    private Double width;
    private Double length;
    private String name;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

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
}
