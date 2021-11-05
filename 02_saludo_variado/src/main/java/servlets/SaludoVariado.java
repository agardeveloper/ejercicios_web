package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaludoVariado
 */
@WebServlet("/SaludoVariado")
public class SaludoVariado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html"); //para decirle que le voy a enviar html
		PrintWriter out = response.getWriter();//para escribir en el cuerpo de la respuesta
		out.println("<html><body>");
		//Voy a generar 6 mensajes. El mismo pero cambiandole el tamaño.
		//Para mostrar distintos titulos de html
		for (int i = 1; i <=6; i++) { //desde que i vale 1 hasta que vale 6
			out.println("<h"+i+">Bienvenido a mi servlet</h"+i+">");
		}//fin for
		out.println("</body></html>");
		out.close(); //Para cerrar el PrintWriter, también puedo ponerlo en un try con recursos
		
	}//fin metodo service

}//fin clase ppal
