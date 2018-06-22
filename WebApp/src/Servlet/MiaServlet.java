package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Login;
import Model.Utente;
import Util.CrudLogin;

@WebServlet("/MiaServlet")
public class MiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MiaServlet() {	
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("op").equals("login")) {
			if ((CrudLogin.readLogin(new Login(request.getParameter("username"),request.getParameter("password")))==1))			
					response.sendRedirect("view.jsp?result="+request.getParameter("username"));
			else 
				response.sendRedirect("index.html?result=Accesso negato.Credenziali errate");
		}
		if(request.getParameter("op").equals("lista")) {
			request.getSession().setAttribute("listUtenti", CrudLogin.readListUtente());
			response.sendRedirect("listaUtenti.jsp");	
		}
		if(request.getParameter("op").equals("AddUsr")) 
				response.sendRedirect("AddUsr.jsp?result="+CrudLogin.createLogin(new Utente(request.getParameter("username"),request.getParameter("nome"),request.getParameter("cognome"),request.getParameter("data")),new Login(request.getParameter("username"),request.getParameter("password"))));	
	}
}
