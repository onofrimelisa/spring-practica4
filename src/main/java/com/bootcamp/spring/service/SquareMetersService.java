package com.bootcamp.spring.service;

import com.bootcamp.spring.dto.ResponseHouseDTO;
import com.bootcamp.spring.dto.RoomDTO;
import com.bootcamp.spring.model.House;
import com.bootcamp.spring.model.Room;

import java.util.HashMap;

public class SquareMetersService {
    private static HashMap<String, Double> squareMetersPerRoom(House house) {
        HashMap<String, Double> squareMeters = new HashMap<>();

        for (Room room :
                house.getRooms()) {
            squareMeters.put(room.getName(), room.getSquareMeters());
        }

        return squareMeters;
    }

    public static ResponseHouseDTO calculateSquareMeters(House house) {
        ResponseHouseDTO responseHouseDTO = new ResponseHouseDTO();

        responseHouseDTO.setSquareMeters(house.calculateSquareMeters());
        responseHouseDTO.setCost(house.calculateCost());
        Room biggestRoom = house.getBiggestRoom();
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setLength(biggestRoom.getLength());
        roomDTO.setWidth(biggestRoom.getWidth());
        roomDTO.setName(biggestRoom.getName());
        responseHouseDTO.setBiggestRoom(roomDTO);
        responseHouseDTO.setSquareMetersPerRoom(squareMetersPerRoom(house));

        return  responseHouseDTO;
    }
}
