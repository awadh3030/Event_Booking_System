package com.codeline.Event_Booking_System.ResponseObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetUserRegistrationResponse {


    String  username;
    String password;
}
