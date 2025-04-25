package com.alesek.contracts_api.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity(name = "user_account")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String occupation;
    private String email;

}
