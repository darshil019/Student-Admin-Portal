package project.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Details extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Details() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String stu_id = request.getParameter("stu_id");
        String stu_name = request.getParameter("stu_name");
        String stu_pass = request.getParameter("stu_pass");
        String stu_eno = request.getParameter("stu_eno");
        String stu_stream = request.getParameter("stu_stream");
        String stu_sem = request.getParameter("stu_sem");
        String delUrl = "Delete?stu_id=" + stu_id;
        String editUrl = "Edit?stu_id=" + stu_id + "&stu_name=" + stu_name + "&stu_pass=" + stu_pass + "&stu_eno=" + stu_eno + "&stu_stream=" + stu_stream + "&stu_sem=" + stu_sem;
        
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Student Details</title>");
        out.println("<style>");
        out.println("body {");
        out.println("    background: linear-gradient(90deg, #C7C5F4, #776BCC);");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    color: #333;");
        out.println("    margin: 0;");
        out.println("    padding: 20px;");
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
        out.println("    margin-bottom: 20px;");
        out.println("}");
        out.println("p {");
        out.println("    font-size: 18px;");
        out.println("    line-height: 1.6;");
        out.println("    margin: 10px 0;");
        out.println("}");
        out.println("a {");
        out.println("    display: inline-block;");
        out.println("    margin: 10px;");
        out.println("    padding: 10px 20px;");
        out.println("    color: #fff;");
        out.println("    background-color: #4C489D;");
        out.println("    text-decoration: none;");
        out.println("    border-radius: 5px;");
        out.println("    transition: background 0.3s;");
        out.println("}");
        out.println("a:hover {");
        out.println("    background-color: #6A679E;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Student Details</h1>");
        out.println("<p><strong>Student ID:</strong> " + stu_id + "</p>");
        out.println("<p><strong>Name:</strong> " + stu_name + "</p>");
        out.println("<p><strong>Password:</strong> " + stu_pass + "</p>");
        out.println("<p><strong>Enrollment No:</strong> " + stu_eno + "</p>");
        out.println("<p><strong>Stream:</strong> " + stu_stream + "</p>");
        out.println("<p><strong>Semester:</strong> " + stu_sem + "</p>");
        out.println("<a href='" + delUrl + "'>Delete</a>");
        out.println("<a href='" + editUrl + "'>Edit</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Optionally handle POST requests
    }
}
