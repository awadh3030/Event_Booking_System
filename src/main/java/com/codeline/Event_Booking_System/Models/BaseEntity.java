package com.codeline.Event_Booking_System.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@Data
public class BaseEntity {

    Date createdDate;
    Date updatedDate;
    Boolean isActive;


}




