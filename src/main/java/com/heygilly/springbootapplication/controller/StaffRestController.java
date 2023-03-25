package com.heygilly.springbootapplication.controller;

import com.heygilly.springbootapplication.models.Room;
import com.heygilly.springbootapplication.models.Staff;
import com.heygilly.springbootapplication.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> getAllStaff(){
        return staffService.getAllStaff();
    }
}
