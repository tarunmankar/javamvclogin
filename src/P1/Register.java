package P1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		String usn= request.getParameter("usn");
		String pwd= request.getParameter("pwd");
		
		try {
			Model m=new Model();
			m.setName(name);
			m.setUsn(usn);
			m.setPwd(pwd);
			boolean b=m.register();
			if(b==true) {
				response.sendRedirect("/MVC2/RegisterSuccess.html");
			}
			else {
				response.sendRedirect("/MVC2/RegisterFailed.html");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
