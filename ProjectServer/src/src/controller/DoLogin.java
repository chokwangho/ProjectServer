package src.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.beans.*;
import src.util.*;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerid= request.getParameter("customerID");
		String password = request.getParameter("password");
		// perform business logic. return a bean as a result
		
		CustomerMap service = new CustomerMap();
		Customer customer = service.findCustomer(customerid);
		String page = null;
		
		if(customer == null)
		{
			request.setAttribute("badid", customerid);
			page = "/jsps/error.jsp";
		}
		else if(!password.equals(customer.getpassword()))
		{
			request.setAttribute("badid", customerid);
			page = "/jsps/error.jsp";
		}
		else
		{
			request.setAttribute("customer", customer);
			page = "/jsps/form.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
