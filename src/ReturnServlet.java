


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
 * Servlet implementation class IssueServlet
 */
@WebServlet("/ReturnServlet")
public class ReturnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ReturnServlet() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		
		String cust_id = request.getParameter("cust_id");
		String isbn_num = request.getParameter("isbn_num");
		String return_date = request.getParameter("return_date");


		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/lms"; 
 		String username = "dbmsproject"; 
 		String password = "Dbms@35_42"; 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);
 		System.out.println("Printing connection object "+conn);

 		
 		
		PreparedStatement smt = conn .prepareStatement("update records set return_date=?,pay_status='complete',paid_amount=100 where isbn_num=? and cust_id=?");
 		smt.setString(3,cust_id);
		smt.setString(2,isbn_num);
		smt.setString(1,return_date);
		int result=smt.executeUpdate();

		
		if(result>0)
		{			
			RequestDispatcher re = request.getRequestDispatcher("AddResult.jsp");
			re.forward(request, response);
		}
		else {
			RequestDispatcher re = request.getRequestDispatcher("Wrong.jsp");
			re.forward(request, response);
		}

		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}
