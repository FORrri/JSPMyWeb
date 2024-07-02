package com.myweb.service;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface BoardService {

	//등록가능
	void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	//목록조회
	void getList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	//글 등록
	void getContent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	//글 수정화면
	void modify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	//글 수정
	void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	//글 삭제
	void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	
}
