package work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice01
 */
public class Practice05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Practice05() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>                                             ");
		out.println("<head>                                             ");
		out.println("  <meta charset=\"UTF-8\">                         ");
		out.println("  <title>演習問題05</title>                        ");
		out.println("</head>                                            ");
		out.println("<body>                                             ");
		out.println("  <h1>演習問題05、大正解！！</h1>                  ");
		out.println("  <p>そろそろURIを使いこなせて来たようですね！</p> ");
		out.println("</body>                                            ");
		out.println("</html>                                            ");
	}
}
