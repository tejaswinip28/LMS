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
@WebServlet("/IssueServlet")
public class IssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public IssueServlet() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		
		String cust_id = request.getParameter("cust_id");
		String isbn_num = request.getParameter("isbn_num");
		String staff_id = request.getParameter("staff_id");
		String issue_date = request.getParameter("issue_date");
		String return_date = request.getParameter("return_date");
		String pay_status = request.getParameter("pay_status");		
		String paid_amount = request.getParameter("paid_amount");


		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/lms"; 
 		String username = "dbmsproject"; 
 		String password = "Dbms@35_42"; 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);
 		System.out.println("Printing connection object "+conn);

 		
 		
		PreparedStatement smt = conn .prepareStatement("insert into records values(?,?,?,?,?,?,?)");
 		smt.setString(1,cust_id);
		smt.setString(2,isbn_num);
		smt.setString(3,staff_id);
		smt.setString(4,issue_date);
		if(return_date.isEmpty()) {
			smt.setString(5, null);
		}
		else {
			smt.setString(5,return_date);
		}
		smt.setString(6,pay_status);
		smt.setString(7,paid_amount);
		int result=smt.executeUpdate();

		
		if(result>0)
		{			
			RequestDispatcher re = request.getRequestDispatcher("IssueResult.jsp");
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