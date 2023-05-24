package com.codeline.Event_Booking_System.Controller;

;
import com.codeline.Event_Booking_System.Models.UserRegistration;
import com.codeline.Event_Booking_System.RequestObjects.GetUserRegistrationRequestObjects;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class UserRegistrationController {


    @RequestMapping("api/register")
    public void saveAccount(@RequestBody GetUserRegistrationRequestObjects userRegistrationRequestObject) {
        createUserRegistration(UserRegistrationRequestObject);





        public void createUserRegistration(GetUserRegistrationRequestObjects userRegistrationRequestObject ) {

            UserRegistration userRegistration = new UserRegistration();
            userRegistration.setusername(userRegistrationRequestObject.getusername());
            userRegistration.setpassword(userRegistrationRequestObject.getpassword());
            userRegistrationRequestService.saveUserRegistration(userRegistration);

;


        }

}