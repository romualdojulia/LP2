package exemplo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
	
		if(login.equals("12345") && senha.equals("12345")) {
			response.sendRedirect(request.getContextPath() + "/Sucesso.jsp");
		}
		else {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}
	}

}
