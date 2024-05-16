
import java.sql.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrationservlet
 */
@WebServlet("/Registrationservlet")
public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String userid=request.getParameter("userid");
        String name = request.getParameter("fullname");
        String userName = request.getParameter("userName");
        String pass = request.getParameter("pass");
        String addr = request.getParameter("address");
        String age = request.getParameter("age");
        String qual = request.getParameter("qual");
        String percent = request.getParameter("percent");
        String year = request.getParameter("yop");
     //  String password = request.getParameter("pwd");
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();  
	//	PrintWriter out=response.getWriter(); 
		//response.sendRedirect("Registration.jsp");  
		RequestDispatcher rd = request.getRequestDispatcher("/Registration.jsp");
		rd.forward(request,response); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Reshamacv@19");
			String query="Insert into register112 values (?,?,?,?,?,?,?,?,?)";    
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, userid);
            pstmt.setString(2,name);
            pstmt.setString(3,userName);
            pstmt.setString(4,pass);
            pstmt.setString(5,addr);
            pstmt.setString(6,age);
            pstmt.setString(7,qual);
            pstmt.setString(8,percent);
            pstmt.setString(9,year);
        //    pstmt.setString(9,password);
            
            int x=pstmt.executeUpdate();    
            
            if(x==1)    
            {    
            pw.println("Values Inserted Successfully");    
           }    
                
        }    
        catch(Exception e)    
        {    
                e.printStackTrace();    
        }    
		pw.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Reshamacv@19");
			String query="Insert into register values (?,?,?,?,?,?,?,?,?)";    
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1,name);
            pstmt.setString(2,userName);
            pstmt.setString(3,pass);
            pstmt.setString(4,addr);
            pstmt.setString(5,age);
            pstmt.setString(6,qual);
            pstmt.setString(7,percent);
            pstmt.setString(8,year);
            pstmt.setString(9,password);
            
            int x=pstmt.executeUpdate();    
            
            if(x==1)    
            {    
            pw.println("Values Inserted Successfully");    
            }    
                
         */       
      
      

}
