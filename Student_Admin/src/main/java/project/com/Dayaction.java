package project.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dayaction
 */
@WebServlet("/Dayaction")
public class Dayaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dayaction() {
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
    

        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println("body {");
        out.println("    background: linear-gradient(90deg, #C7C5F4, #776BCC);");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    display: flex;");
        out.println("    justify-content: center;");
        out.println("    align-items: center;");
        out.println("    height: 100vh;");
        out.println("    margin: 0;");
        out.println("}");
        out.println("form {");
        out.println("    background-color: #fff;");
        out.println("    padding: 20px;");
        out.println("    border-radius: 10px;");
        out.println("    box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);");
        out.println("}");
        out.println("table {");
        out.println("    width: 100%;");
        out.println("}");
        out.println("td {");
        out.println("    padding: 10px;");
        out.println("}");
        out.println("input[type='text'], input[type='submit'] {");
        out.println("    width: 100%;");
        out.println("    padding: 8px;");
        out.println("    margin: 5px 0;");
        out.println("    box-sizing: border-box;");
        out.println("    border-radius: 5px;");
        out.println("    border: 1px solid #ccc;");
        out.println("}");
        out.println("input[type='submit'] {");
        out.println("    background-color: #776BCC;");
        out.println("    color: white;");
        out.println("    border: none;");
        out.println("    cursor: pointer;");
        out.println("}");
        out.println("input[type='submit']:hover {");
        out.println("    background-color: #5b52a3;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action = 'Editdayaction' method = 'POST'>");
        out.println("<table>");
        out.println("<tr><td></td><td><input type = 'hidden' name = 'tid' value = '" + tid + "'></td></tr>");
        out.println("<tr><td>Day : </td><td><input type = 'text' name = 'day' value = '" + day + "'></td></tr>");
        
        out.println("<tr><td>lecture 1 : </td><td><input type = 'text' name = 'lec1' value = '" + lec1 + "'></td></tr>");
        out.println("<tr><td>teacher 1 : </td><td><input type = 'text' name = 'teacher1' value = '" + teacher1 + "'></td></tr>");
        out.println("<tr><td>Time : </td><td><input type = 'text' name = 'time1' value = '" + time1 + "'></td></tr>");
        
        out.println("<tr><td>lecture 2 : </td><td><input type = 'text' name = 'lec2' value = '" + lec2 + "'></td></tr>");
        out.println("<tr><td>teacher 2 : </td><td><input type = 'text' name = 'teacher2' value = '" + teacher2 + "'></td></tr>");
        out.println("<tr><td>Time : </td><td><input type = 'text' name = 'time2' value = '" + time2 + "'></td></tr>");
        
        out.println("<tr><td>lecture 3 : </td><td><input type = 'text' name = 'lec3' value = '" + lec3 + "'></td></tr>");
        out.println("<tr><td>teacher 3 : </td><td><input type = 'text' name = 'teacher3' value = '" + teacher3 + "'></td></tr>");
        out.println("<tr><td>Time : </td><td><input type = 'text' name = 'time3' value = '" + time3 + "'></td></tr>");
        
        out.println("<tr><td></td><td><input type = 'submit' name = 'submit' value = 'Submit'></td></tr>");
        out.println("</table>");
        out.println("</form>");
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
