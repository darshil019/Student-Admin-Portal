package project.com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Editdayaction
 */
@WebServlet("/Editdayaction")
public class Editdayaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editdayaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		String tid = request.getParameter("tid");
        String day = request.getParameter("day");
        String lec1 = request.getParameter("lec1");
        String teacher1 = request.getParameter("teacher1");
        String time1 = request.getParameter("time1");
        String lec2 = request.getParameter("lec2");
        String teacher2 = request.getParameter("teacher2");
        String time2 = request.getParameter("time2");
        String lec3 = request.getParameter("lec3");
        String teacher3 = request.getParameter("teacher3");
        String time3 = request.getParameter("time3");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Sky$1910");
			PreparedStatement pst = con.prepareStatement("update imscit set day = ?,lec1 = ?,teacher1 = ?,time1 = ? , lec2 = ?,teacher2 = ?,time2 = ? , lec3 = ?,teacher3 = ?,time3 = ? where tid = ?");
			pst.setString(1, day);
			pst.setString(2, lec1);
			pst.setString(3, teacher1);
			pst.setString(4, time1);
			pst.setString(5, lec2);
			pst.setString(6, teacher2);
			pst.setString(7, time2);
			pst.setString(8, lec3);
			pst.setString(9, teacher3);
			pst.setString(10, time3);
			pst.setString(11, tid);
			
			pst.executeUpdate();
			
			
			RequestDispatcher rd = request.getRequestDispatcher("admin_homepage.jsp");
			rd.forward(request, response);
			
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
