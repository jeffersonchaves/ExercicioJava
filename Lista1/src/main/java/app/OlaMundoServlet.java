package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usuarios")
public class OlaMundoServlet extends HttpServlet{
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//PrintWriter out = resp.getWriter();
		
		String frase = "Olá Mundo Vindo da Serlvet";
		
		req.setAttribute("frase", frase);
		
		RequestDispatcher disp = req.getRequestDispatcher("olamundo.jsp");
		disp.forward(req, resp);
		
		
	}

}
