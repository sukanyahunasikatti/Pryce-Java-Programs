package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greetservlet
 */
public class Greetservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Greetservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside doGet() of GS");
	
	PrintWriter out= response.getWriter();
	String name=request.getParameter("uname");
	String a=request.getParameter("age");
	String msg="";
	int age=0;
	System.out.println("name" +name+ " a = "+a);
	
	if(name==null || name.trim().equals(""))
	msg="Boss enter ur name. or else you will self restruct in 3sec </br>";
	

	if(a==null || a.trim().equals(""))
		
	msg = msg+"oye enter ur age";
	
	{
		try {
		age= Integer.parseInt(a);
		if(age<=0 || age>=150)
			msg=msg+"Either you are yet to be born or u r ghost!!</br>";
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			msg= msg+ "yakri Mr(s)! enter your age in numbers... digits..u nut!"; 
		}
		if(msg.equals(""))
		{
			if(age<35)
				out.println("<h1> Output</h1> <b>  Welcome "+ name+" youngsrate!!");
				else
					if(age<60)
						out.println("<h1> Output</h1> <b>  Welcome "+ name+" middleagers!!");
					else
						out.println("<h1> Output</h1> <b>  Welcome "+ name+ "buddiss!");


		}
		else
		{
			
			out.println("<h1> Reeor</h1><b> "+msg+"</b></h1>");
		}
	}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
