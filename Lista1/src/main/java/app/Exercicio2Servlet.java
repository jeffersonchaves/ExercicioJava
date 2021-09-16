package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/exercio"})
public class Exercicio2Servlet extends HttpServlet {
	
	
	@GET("/requisicao")
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		/*
		i.Método;
		ii. URI do Pedido;
		iii. Protocolo.
		*/
		
		String metodo = requisicao.getMethod();
		String uri = requisicao.getRequestURI();
		String protocolo = requisicao.getProtocol();
		
		List<String> listaInformacoes = new ArrayList<>(); 
		listaInformacoes.add(metodo);
		listaInformacoes.add(uri);
		listaInformacoes.add(protocolo);
		
		requisicao.setAttribute("informacaoRequisicao", listaInformacoes);
		
		RequestDispatcher disp = requisicao.getRequestDispatcher("olamundo.jsp");
		disp.forward(requisicao, resposta);
		
	}

}
