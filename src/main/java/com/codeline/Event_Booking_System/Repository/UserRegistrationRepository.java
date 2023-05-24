package com.codeline.Event_Booking_System.Repository;

import com.codeline.Event_Booking_System.Models.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {



}
