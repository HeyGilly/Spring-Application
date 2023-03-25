package com.heygilly.springbootapplication.service;

import com.heygilly.springbootapplication.models.Positions;
import com.heygilly.springbootapplication.models.Room;
import com.heygilly.springbootapplication.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class StaffService {

    public static final List<Staff> staffMember = new ArrayList<>();

    static{
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Bobby", "Smith", Positions.CONCIERGE.toString()));
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Lucy", "Babel",  Positions.CONCIERGE.toString()));
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Christy", "Lucas",  Positions.FRONT_DESK.toString()));
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Mark", "Beckon",  Positions.FRONT_DESK.toString()));
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Chris", "Larson",  Positions.SECURITY.toString()));
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Miseal", "Campbell",  Positions.SECURITY.toString()));
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Stephan", "Hardin",  Positions.HOUSEKEEPING.toString()));
        staffMember.add(new Staff(UUID.randomUUID().toString(), "Edgardo", "Ortiz",  Positions.HOUSEKEEPING.toString()));
    }


    public List<Staff> getAllStaff(){ return staffMember;}


}
