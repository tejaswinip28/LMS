


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddCustServlet")
public class AddCustServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddCustServlet() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		
		String cust_id = request.getParameter("cust_id");
		String cust_name = request.getParameter("cust_name");
		String cust_phno = request.getParameter("cust_phno");
		String cust_email = request.getParameter("cust_email");

		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/lms"; //MySQL URL and followed by the database name
 		String username = "dbmsproject"; //MySQL username
 		String password = "Dbms@35_42"; //MySQL password
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password); 
 		System.out.println("Printing connection object "+conn);

		PreparedStatement smt = conn .prepareStatement("insert into customer values(?,?,?,?)");
 		smt.setString(1,cust_id);
		smt.setString(2,cust_name);
		smt.setString(3,cust_phno);
		smt.setString(4,cust_email);
		int result=smt.executeUpdate();
		
		if(result>0)
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("AddResult.jsp");
			rd.forward(request, response);
		}
		
 		
 
		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}
