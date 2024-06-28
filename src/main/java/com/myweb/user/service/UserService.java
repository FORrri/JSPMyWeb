package com.myweb.user.service;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface UserService {
	
	void join(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ; //메서드

	void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ; //메서드
	
	void getInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ; //메서드

	void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ; //메서드


}
