package com.codersarts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class QualServlet extends HttpServlet {
	
  @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  //get Data
	String skill = req.getParameter("skillName");  
	String qual = req.getParameter("qualName");
	System.out.println(" Qual name from jsp > > "+qual);
	
	

	// first check what you have brought 123456
	// tomcat brings it own id 
	//123456 == 123456 -- matching
	//therefore tomcat will not create any new id and says its a old session
	HttpSession session = req.getSession();
	if(session==null)
	{
		RequestDispatcher rd = req.getRequestDispatcher("skill.jsp");
		
		rd.forward(req, resp);
		
	}
	
	
	else {
	System.out.println(session.getId());
	
	
	// process data
	req.setAttribute("skillForPreview", skill);
	req.setAttribute("qualForPreview", qual);
	
	//navigate data
	RequestDispatcher rd = req.getRequestDispatcher("preview.jsp");
	
	rd.forward(req, resp);
   
    } 
    

}
	

}
