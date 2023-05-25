package com.codeline.Event_Booking_System.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetUserRegistrationRequestObjects {

    String  username;
    String password;
}
