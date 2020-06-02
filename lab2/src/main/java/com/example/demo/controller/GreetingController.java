package com.example.demo.controller;


import com.example.demo.dto.GreetingDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController //restful 웹서비스를 위한 컨트롤러 쉽게 정의.
public class GreetingController {
    private static final String template  = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public GreetingDTO greeting(@RequestParam(value = "name ",defaultValue = "World")String name){
        return new GreetingDTO(counter.incrementAndGet(), String.format(template,name));
        //greeting() 메소드는 id와 content를 멤버 변수로 가지고 있는 새 GreetingDTO 객체를 만들어 반환합니다.
        //이 때, HTTP 응답으로 GreetingDTO 객체의 데이터가 JSON 형태로 전달됩니다.
    }
}
