package com.heygilly.springbootapplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.heygilly.springbootapplication.service.StaffService.staffMember;


@Controller
@RequestMapping("/staff")
public class StaffController {



    @GetMapping
    public String staffMembers(Model model){
        model.addAttribute("staff", staffMember);
        return "staff";
    }
}
