package project.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
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
        out.println("<form action = 'Editaction' method = 'POST'>");
        out.println("<table>");
        out.println("<tr><td></td><td><input type = 'hidden' name = 'stu_id' value = '" + stu_id + "'></td></tr>");
        out.println("<tr><td>Student Name : </td><td><input type = 'text' name = 'stu_name' value = '" + stu_name + "'></td></tr>");
        out.println("<tr><td>Student password : </td><td><input type = 'text' name = 'stu_pass' value = '" + stu_pass + "'></td></tr>");
        out.println("<tr><td>Student enrollment no : </td><td><input type = 'text' name = 'stu_eno' value = '" + stu_eno + "'></td></tr>");
        out.println("<tr><td>Student stream : </td><td><input type = 'text' name = 'stu_stream' value = '" + stu_stream + "'></td></tr>");
        out.println("<tr><td>Student sem : </td><td><input type = 'text' name = 'stu_sem' value = '" + stu_sem + "'></td></tr>");
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
		//doGet(request, response);
	}

}
