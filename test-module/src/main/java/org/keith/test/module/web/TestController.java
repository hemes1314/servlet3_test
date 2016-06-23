package org.keith.test.module.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="testController",urlPatterns="/testController")  
public class TestController extends HttpServlet {
	
    private static final long serialVersionUID = 1L;  
    
    @Override  
    protected void doGet(HttpServletRequest requset, HttpServletResponse response)  
            throws ServletException, IOException {  
        System.out.println("doGet-->");  
        doPost(requset, response);  
    }  
  
    @Override  
    protected void doPost(HttpServletRequest requset, HttpServletResponse response)  
            throws ServletException, IOException {  
        System.out.println("doPost-->");  
        response.setContentType("text/html; charset=utf-8");  
        PrintWriter out = response.getWriter();  
  
        out.println("<html>");  
        out.println("<head>");  
        out.println("<title>TestController</title>");  
        out.println("</head>");  
        out.println("<body>");  
        out.println("<p>"+requset.getParameter("p")+"</p>");  
        out.println("<p>Hello, this is TestController!</p>");  
        out.println("</body>");  
        out.println("</html>");  
  
    }  

}
