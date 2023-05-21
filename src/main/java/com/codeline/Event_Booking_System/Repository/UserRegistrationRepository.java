package com.codeline.Event_Booking_System.Repository;

import com.codeline.Event_Booking_System.Models.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {

    UserRegistration findByUsername(String username);

}
