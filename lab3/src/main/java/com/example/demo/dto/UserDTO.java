package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UserDTO {
    private int seq;
    private String name;
    private String country;

}
