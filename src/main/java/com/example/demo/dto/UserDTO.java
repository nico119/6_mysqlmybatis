package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private int user_id;
    private String user_name;
    private String user_password;
}