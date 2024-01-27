package com.perico.apiOracle.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserLoginPetition {
    private String email;
    private String password;
}
