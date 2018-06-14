package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Login;
import Util.CrudLogin;

@WebServlet("/MiaServlet")
public class MiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MiaServlet() {
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("op").equals("login")) {
			if ((CrudLogin.readLogin(new Login(request.getParameter("nomeUtente"),request.getParameter("password")))==1))			
					response.sendRedirect("view.jsp?result="+request.getParameter("nomeUtente"));
			else {
				request.getSession().setAttribute("result", "Accesso negato.Credenziali errate");
				response.sendRedirect("index.html");
			}
		}
		if(request.getParameter("op").equals("lista")) {
			request.getSession().setAttribute("listUtenti", CrudLogin.readListLogin());
			response.sendRedirect("listaUtenti.jsp");	
		}
	}
}
