package com.uttara.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
System.out.println("inside no-arg cnstsr of FS");
    
    }
    @Override
    public void init() throws ServletException{
System.out.println("inside init() of FS");    	
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("inside doGet() of FS");

request.setAttribute("data", "dataSetIntoRequest");
HttpSession s=request.getSession(true);
s.setAttribute("data", "dataSetintoSession");
ServletContext sc= getServletContext();
sc.setAttribute("data", "dataSetIntoContext");



RequestDispatcher rd=request.getRequestDispatcher("/second");
rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
