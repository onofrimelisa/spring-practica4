package com.bootcamp.spring.controller;

import com.bootcamp.spring.dto.HouseDTO;
import com.bootcamp.spring.dto.ResponseHouseDTO;
import com.bootcamp.spring.dto.RoomDTO;
import com.bootcamp.spring.model.House;
import com.bootcamp.spring.model.Room;
import com.bootcamp.spring.service.SquareMetersService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SquareMetersCotroller {
    
    @PostMapping("/calculate")
    public ResponseHouseDTO calculateSquareMeters(@RequestBody HouseDTO houseDTO) {
        House house = new House(houseDTO.getName(),
                houseDTO.getAddress(),
                houseDTO.getLength(),
                houseDTO.getWidth());

        for (RoomDTO roomDTO :
                houseDTO.getRooms()) {
            Room room = new Room(roomDTO.getWidth(), roomDTO.getLength(), roomDTO.getName());
            house.addRoom(room);
        }

        ResponseHouseDTO response = SquareMetersService.calculateSquareMeters(house);
        return response;
    }
    
}
