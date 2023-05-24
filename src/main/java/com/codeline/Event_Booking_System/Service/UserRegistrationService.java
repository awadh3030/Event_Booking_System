package com.codeline.Event_Booking_System.Service;

import com.codeline.Event_Booking_System.Models.UserRegistration;
import com.codeline.Event_Booking_System.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRegistrationService {

    @Autowired
    UserRegistrationRepository userRegistrationRepository;

    public List<UserRegistration> getUserRegistration() {
        return userRegistrationRepository.findAll();
    }


    public void saveUserRegistration(UserRegistration userRegistration) {userRegistrationRepository.save(userRegistration);}





}
