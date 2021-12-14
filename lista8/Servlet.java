package conteudos;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Conteudo")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String assunto = request.getParameter("assunto");
		String mensagem = request.getParameter("mensagem");
		
		HttpSession session = request.getSession();
		
		ArrayList<Conteudo> lista = (ArrayList<Conteudo>) session.getAttribute("lista");
		
		if(lista == null || lista.isEmpty()) {
			lista = new ArrayList<Conteudo>();
		}
		
		Conteudo conteudo = new Conteudo(assunto, mensagem);
		lista.add(conteudo);
		
		session.setAttribute("lista", lista);
		response.sendRedirect(request.getContextPath() + "/listar.jsp");
	}
}
