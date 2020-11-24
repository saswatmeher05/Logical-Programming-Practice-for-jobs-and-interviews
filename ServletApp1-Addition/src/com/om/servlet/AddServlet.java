package com.om.servlet;
//ctrl+shift+o
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int i=Integer.parseInt(req.getParameter("num1"));  //Integer-Wrapper Class
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		pw.println("<div align='center'>");
		pw.println("Result is: "+k);

		pw.println("<a href='index.html'>");
		pw.println("<img src='home.png' width='100' height='100'></a>");
		pw.println("</div>");
		
		
	}
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		doGet(req,res);
	}

}
