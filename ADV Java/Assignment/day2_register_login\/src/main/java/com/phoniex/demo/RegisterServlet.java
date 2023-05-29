package com.phoniex.demo;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegisterServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		System.out.println("Proces is going on...");
		PrintWriter out=resp.getWriter();
		out.println("Servlet code executed");
		String user=req.getParameter("userName");
		String pwd=req.getParameter("pwd");
		System.out.println(user + " " + pwd);
	}
}
