package com.coders.foodcart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the data from the DB
		
		String[] foodItems = {"egg","salad","Pasta"};
		request.setAttribute("items",foodItems);
		
		// redirect to a different pages
	RequestDispatcher dispatcher = request.getRequestDispatcher("show-food.jsp");
	dispatcher.forward(request, response);
	}

}
