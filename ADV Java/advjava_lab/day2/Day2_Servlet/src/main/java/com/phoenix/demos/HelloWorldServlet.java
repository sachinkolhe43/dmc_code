package com.phoenix.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet{
	
		public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
			System.out.println("Hello World");
			PrintWriter out=resp.getWriter();
			out.println("This is from serlet");
			String user = req.getParameter("userName");
			String pwd = req.getParameter("pwd");
			System.out.println(user+" "+pwd);
		}
		
		
}
