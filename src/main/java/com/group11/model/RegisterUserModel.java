package com.group11.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserModel {
    private String email;
    private String password;
    private String name;
    private String otp;
}