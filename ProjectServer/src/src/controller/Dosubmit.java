package src.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dosubmit
 */
@WebServlet("/Dosubmit")
public class Dosubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Dosubmit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String value[] = {"ItemNumber","Description", "MiddleInitial", "PriceEach", 
				"FirstName", "LastName", "Address", "CreditCard", "CardNumber", "RepeatCardNumber"};
		String requestValue[] = new String [10];
		for(int i=0; i<value.length; i++)
		{
			requestValue[i] = request.getParameter(value[i]);
		}

		String page = null;
		for(int i=0; i<value.length; i++)
		{
			if(requestValue[i].equals(""))
				requestValue[i] = "No Value";
		}
		
		for(int i=0; i<value.length; i++)
		{
			request.setAttribute(value[i], requestValue[i]);
		}
		page = "/jsps/response.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

	}
}
