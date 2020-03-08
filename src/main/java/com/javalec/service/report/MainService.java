package com.javalec.service.report;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MainService {
	public void show(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException;
}
