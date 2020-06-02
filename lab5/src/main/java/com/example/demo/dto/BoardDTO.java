package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor //아무 파라미터도 넘기지 않는 생성자.
@AllArgsConstructor
@Getter
@Setter
public class BoardDTO {
    private int seq;
    private String title;
    private String contents;
    private String author;
    private String password;
    private int reads = 0;
    private String deleted = "N";
}
