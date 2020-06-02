package com.example.demo.controller;

import com.example.demo.dao.BoardDAO;
import com.example.demo.dto.BoardDTO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@MapperScan(basePackages = "com.example.demo.dao")
public class BoardController {

    @Autowired
    private BoardDAO boardDAO;

    @RequestMapping(value = "/board", method = RequestMethod.POST)
    public BoardDTO users(BoardDTO board) throws Exception {
        boardDAO.newBoard(board);
        return board;
    }

}
