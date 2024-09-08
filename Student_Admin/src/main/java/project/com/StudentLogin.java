package project.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentLogin
 */
@WebServlet("/StudentLogin")
public class StudentLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLogin() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String stu_eno = request.getParameter("stu_eno");
        String stu_pass = request.getParameter("stu_pass");
        Boolean LoggedIn = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Sky$1910");
            PreparedStatement pst = con.prepareStatement("select * from student where stu_eno = ? and stu_pass = ?");
            pst.setString(1, stu_eno);
            pst.setString(2, stu_pass);
            ResultSet rs = pst.executeQuery();
            request.setAttribute("stu_eno", stu_eno);

            while(rs.next()) {
                LoggedIn = true;
            }

            if(LoggedIn) {
                PreparedStatement pst1 = con.prepareStatement("select * from student where stu_eno = ?");
                pst1.setString(1, stu_eno);
                ResultSet rs1 = pst1.executeQuery();

                while(rs1.next()) {
                    String stu_id = rs1.getString(1);
                    String stu_name = rs1.getString(2);
                    String stu_pass1 = rs1.getString(3);
                    String stu_eno1 = rs1.getString(4);
                    String stu_stream = rs1.getString(5);
                    String stu_sem = rs1.getString(6);

                    out.println("<html>");
                    out.println("<head>");
                    out.println("<style>");
                    out.println("body {");
                    out.println("  background: linear-gradient(90deg, #C7C5F4, #776BCC);");
                    out.println("  font-family: Arial, sans-serif;");
                    out.println("  color: #333;");
                    out.println("  padding: 20px;");
                    out.println("}");
                    out.println(".student-info {");
                    out.println("  background-color: #fff;");
                    out.println("  padding: 20px;");
                    out.println("  border-radius: 10px;");
                    out.println("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
                    out.println("  width: 50%;");
                    out.println("  margin: 0 auto;");
                    out.println("}");
                    out.println(".student-info h2 {");
                    out.println("  text-align: center;");
                    out.println("  color: #5D54A4;");
                    out.println("}");
                    out.println(".student-info p {");
                    out.println("  font-size: 18px;");
                    out.println("  line-height: 1.6;");
                    out.println("  color: #333;");
                    out.println("}");
                    out.println("</style>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<div class='student-info'>");
                    out.println("<h2>Student Details</h2>");
                    out.println("<p><strong>Student ID:</strong> " + stu_id + "</p>");
                    out.println("<p><strong>Student Name:</strong> " + stu_name + "</p>");
                    out.println("<p><strong>Enrollment No:</strong> " + stu_eno1 + "</p>");
                    out.println("<p><strong>Password:</strong> " + stu_pass1 + "</p>");
                    out.println("<p><strong>Stream:</strong> " + stu_stream + "</p>");
                    out.println("<p><strong>Semester:</strong> " + stu_sem + "</p>");
                    out.println("<a href='imscit.html'>Check Time Table</a>");
                    out.println("</div>");
                    out.println("</body>");
                    out.println("</html>");
                }

            } else {
                RequestDispatcher rd = request.getRequestDispatcher("student_signup.html");
                rd.forward(request, response);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
