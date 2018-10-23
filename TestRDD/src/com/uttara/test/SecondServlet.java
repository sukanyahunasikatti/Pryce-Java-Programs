package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        System.out.println("inside no-arg constr of SS");
    }
    
    @Override
    public void init() throws ServletException{
    	System.out.println("inside init() of SS");
    }
    	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("inside doGet of SS");
PrintWriter p=response.getWriter();
String dataFromReq=(String) request.getAttribute("data");
String dataFromSess= (String)(request.getSession(false)).getAttribute("data");
String dataFromCtx = (String)(getServletContext().getAttribute("data"));
out.println("datafromreq= "+dataFromReq +"<br/>");
out.println("datafromses= "+dataFromSess +"<br/>");
out.println("datafromctx= "+dataFromCtx +"<br/>");

out.println("<b>Response sent from SecondServlet");

//String reqData=(String) request.getAttribute("req");

//p.write("<html><body>request data ="+reqData+"</body></html>");


	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
