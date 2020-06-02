package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor //this.var=var 같은 생성자 자동.
@Getter //getID(), getContent() 등의 Getter 자동
@Setter //setId(), setContent등이 setter 자동
public class GreetingDTO {
    private long id;
    private String content;

}
