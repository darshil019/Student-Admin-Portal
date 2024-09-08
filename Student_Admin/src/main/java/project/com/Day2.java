package project.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Day2
 */
@WebServlet("/Day2")
public class Day2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Day2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
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
        String linkUrl = "imscit.html";
        
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Student TimeTable</title>");
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
        out.println("<p><strong>Time Table id :</strong> " + tid + "</p>");
        out.println("<p><strong>Day :</strong> " + day + "</p>");
        out.println("<p><strong>lecture 1 :</strong> " + lec1 + "</p>");
        out.println("<p><strong>teacher 1 :</strong> " + teacher1 + "</p>");
        out.println("<p><strong>time 1 :</strong> " + time1 + "</p>");
        out.println("<p><strong>lecture 2 :</strong> " + lec2 + "</p>");
        out.println("<p><strong>teacher 2 :</strong> " + teacher2 + "</p>");
        out.println("<p><strong>time 2 :</strong> " + time2 + "</p>");
        out.println("<p><strong>lecture 3 :</strong> " + lec3 + "</p>");
        out.println("<p><strong>teacher 3 :</strong> " + teacher3 + "</p>");
        out.println("<p><strong>time 3 :</strong> " + time3 + "</p>");
        out.println("<a href='" + linkUrl + "'>Go to Stream</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
