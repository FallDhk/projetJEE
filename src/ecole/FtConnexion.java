package ecole;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FtConnexion
 */
@WebFilter("/FtConnexion")
public class FtConnexion implements Filter {

    /**
     * Default constructor. 
     */
    public FtConnexion() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out =response.getWriter();
		String logine1=request.getParameter("login");
		String pass1=request.getParameter("pass");
		
		 String logine="admin";		 
		 String pass="admin";
		 if(logine1.contentEquals(logine) && pass1.contentEquals(pass)) {
			 chain.doFilter(request, response);
		 }else {
			 out.println("les donnes saisie sont incorecte ");
		 }
		
		
		
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
