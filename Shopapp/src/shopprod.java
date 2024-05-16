

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class shopprod
 */
@WebServlet("/shopprod")
public class shopprod extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean flag;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shopprod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pr=response.getWriter();
		String it=request.getParameter("items");
		for(int i=0;i<4;i++)
		{
			if(it.equals("items"))
			{
				flag = false;
				Cookie c1=new Cookie("Items",it);
				response.addCookie(c1);
			}
			else {
		
		
		request.getRequestDispatcher("prodlist.html").forward(request, response);
	}
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
