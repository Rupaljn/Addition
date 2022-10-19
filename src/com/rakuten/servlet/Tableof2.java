package com.rakuten.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tableof2
 */
@WebServlet("/Tableof2")
public class Tableof2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tableof2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.print("<html>");
out.print("<body>");
out.print("<h1>2</h1>");
out.print("<br>");
out.print("<h1>4</h1>");
out.print("<br>");
out.print("<h1>6</h1>");
out.print("<br>");
out.print("<h1>8</h1>");
out.print("<br>");
out.print("<h1>10</h1>");
out.print("<br>");
out.print("<h1>12</h1>");
out.print("<br>");
out.print("<h1>14</h1>");
out.print("<br>");
out.print("<h1>16</h1>");
out.print("<br>");
out.print("<h1>18</h1>");
out.print("<br>");
out.print("<h1>20</h1>");









out.print("</body>");
out.print("</html");
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
