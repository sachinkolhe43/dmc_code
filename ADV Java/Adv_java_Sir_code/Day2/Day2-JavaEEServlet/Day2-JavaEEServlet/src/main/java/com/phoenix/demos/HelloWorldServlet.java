package com.phoenix.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("Hello World");
		PrintWriter out=res.getWriter();
		out.println("Servlet code executed");
		String user=req.getParameter("userName");
		String pwd=req.getParameter("pwd");
		System.out.println(user + " " + pwd);
	}
	
}
