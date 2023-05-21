package com.codeline.Event_Booking_System.Controller;

import com.codeline.Event_Booking_System.Models.UserRegistration;
import com.codeline.Event_Booking_System.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/register")

public class UserRegistrationController {


     UserRegistrationRepository userRegistrationRepository;

    @Autowired
    public UserRegistrationController(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
    }

    @PostMapping("/register")
    public String UserRegistration(@RequestBody UserRegistration userRegistration) {
        if (userRegistrationRepository.findByUsername(userRegistration.getUsername()) != null) {
            return "Username already exists";
        }

        UserRegistration userRegistration1 = new UserRegistration();
        userRegistration1.setUsername(userRegistration.getUsername());
        userRegistration1.setPassword(userRegistration.getPassword());

        userRegistrationRepository.save(userRegistration);
        return "User registered successfully";


    }
}