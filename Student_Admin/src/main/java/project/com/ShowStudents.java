package project.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowStudents
 */
@WebServlet("/ShowStudents")
public class ShowStudents extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudents() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "Sky$1910");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM student");
            ResultSet rs = pst.executeQuery();

            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>Student List</title>");
            out.println("<style>");
            out.println("body {");
            out.println("    background: linear-gradient(90deg, #C7C5F4, #776BCC);");
            out.println("    font-family: Arial, sans-serif;");
            out.println("    margin: 0;");
            out.println("    padding: 20px;");
            out.println("    color: #333;");
            out.println("}");
            out.println(".container {");
            out.println("    max-width: 800px;");
            out.println("    margin: 0 auto;");
            out.println("    padding: 20px;");
            out.println("    background: #fff;");
            out.println("    border-radius: 8px;");
            out.println("    box-shadow: 0 0 10px rgba(0,0,0,0.1);");
            out.println("}");
            out.println("h1 {");
            out.println("    color: #4C489D;");
            out.println("    text-align: center;");
            out.println("}");
            out.println("a {");
            out.println("    display: block;");
            out.println("    text-align: center;");
            out.println("    margin: 10px 0;");
            out.println("    text-decoration: none;");
            out.println("    color: #5D54A4;");
            out.println("    font-size: 18px;");
            out.println("    border: 2px solid #5D54A4;");
            out.println("    padding: 10px;");
            out.println("    border-radius: 5px;");
            out.println("    transition: background 0.3s, color 0.3s;");
            out.println("}");
            out.println("a:hover {");
            out.println("    background: #5D54A4;");
            out.println("    color: #fff;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>Student List</h1>");

            while (rs.next()) {
                String stu_id = rs.getString(1);
                String stu_name = rs.getString(2);
                String stu_pass = rs.getString(3);
                String stu_eno = rs.getString(4);
                String stu_stream = rs.getString(5);
                String stu_sem = rs.getString(6);

                String linkUrl = "Details?stu_id=" + stu_id + "&stu_name=" + stu_name + "&stu_pass=" + stu_pass + "&stu_eno=" + stu_eno + "&stu_stream=" + stu_stream + "&stu_sem=" + stu_sem;

                out.println("<a href='" + linkUrl + "'>" + stu_name + "</a>");
            }

            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Optionally handle POST requests
    }
}
