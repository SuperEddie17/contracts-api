package com.alesek.contracts_api.user;


import jakarta.persistence.Entity;

import java.util.UUID;


public class UserEntity {

    private UUID uuid;
    private String firstName;
    private String lastName;
    private String occupation;
    private String email;

}
