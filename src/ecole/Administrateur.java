package ecole;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Administrateur extends HttpServlet{	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<body>");
		out.println("<h1>Bienvenu</h1>");
		out.println("</body>");
		out.println("</HTML>");
	}
}
