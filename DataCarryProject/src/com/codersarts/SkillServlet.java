package com.codersarts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SkillServlet extends HttpServlet {
	
  @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  //get Data
	String sk = req.getParameter("skillName");
	System.out.println(" Skill name from jsp > > "+sk);
	
	//generate jsession id and  store on server ....12345 
	HttpSession session = req.getSession();
	
	if(!session.isNew()) {
		System.out.println(session.getId());
		session.invalidate();
		session = req.getSession(); 
		System.out.println(session.getId());
	}
	
	
	
	
	
	
	// process data
		req.setAttribute("skillForNextPage", sk);
	
	
	//navigate data
		
		//take that id to  a client machine and store there by coperating witha  browser
	RequestDispatcher rd = req.getRequestDispatcher("qual.jsp");
	rd.forward(req, resp);
	
   
    } 
    

	
	

}
