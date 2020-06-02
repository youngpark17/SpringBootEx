package com.example.demo.dao;

import com.example.demo.dto.BoardDTO;

public interface BoardDAO {

    int newBoard(BoardDTO param) throws Exception;
    //6번째 줄: MyBatis의 <insert>는 INSERT에 성공했을 때 정수 1을 반환합니다.
}
