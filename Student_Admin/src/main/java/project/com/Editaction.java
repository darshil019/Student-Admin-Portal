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
 * Servlet implementation class Editaction
 */
@WebServlet("/Editaction")
public class Editaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editaction() {
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
		String stu_id = request.getParameter("stu_id");
        String stu_name = request.getParameter("stu_name");
        String stu_pass = request.getParameter("stu_pass");
        String stu_eno = request.getParameter("stu_eno");
        String stu_stream = request.getParameter("stu_stream");
        String stu_sem = request.getParameter("stu_sem");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Sky$1910");
			PreparedStatement pst = con.prepareStatement("update student set stu_name = ?,stu_pass = ?,stu_eno = ?,stu_stream = ?,stu_sem = ? where stu_id = ?");
			pst.setString(1, stu_name);
			pst.setString(2, stu_pass);
			pst.setString(3, stu_eno);
			pst.setString(4, stu_stream);
			pst.setString(5, stu_sem);
			pst.setString(6, stu_id);
			
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
