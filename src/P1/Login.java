package P1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String usn= request.getParameter("usn");
	String pwd= request.getParameter("pwd");
	
	try {
		Model m=new Model();
		m.setUsn(usn);
		m.setPwd(pwd);
		boolean b=m.login();
		if(b==true) {
			response.sendRedirect("/MVC2/LoginSuccess.html");
		}
		else {
			response.sendRedirect("/MVC2/LoginFailed.html");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
  }
}
