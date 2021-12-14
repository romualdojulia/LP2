package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if(login.equals("12345") && senha.contentEquals("12345")) {
			
			Cookie c1 = new Cookie("login", login);
			response.addCookie(c1);
			
			Cookie c2 = new Cookie("senha", senha);
			response.addCookie(c2);
			
			response.sendRedirect( request.getContextPath() + "/Sucesso.jsp");
		}
		
		else {
			response.sendRedirect( request.getContextPath() + "/index.jsp");
		}
	}

}
