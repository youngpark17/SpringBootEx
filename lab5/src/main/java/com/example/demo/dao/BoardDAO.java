package com.example.demo.dao;

import com.example.demo.dto.BoardDTO;

public interface BoardDAO {
    int newBoard(BoardDTO param) throws Exception;
    BoardDTO getBoard(BoardDTO param) throws Exception;
    int editBoard(BoardDTO param) throws Exception;
}
