package com.heygilly.springbootapplication.service;

import com.heygilly.springbootapplication.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    public static final List<Room> rooms = new ArrayList<>();

    static {
        for(long i = 0; i < 10; i++) {
            rooms.add(new Room(i, "Room "+i, "R"+i, "Q"));
        }
    }

    public List<Room> getAllRooms(){ return rooms;}


}
