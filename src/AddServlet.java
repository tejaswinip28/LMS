


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
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddServlet() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		
		String book_id = request.getParameter("book_id");
		String book_name = request.getParameter("book_name");
		String author_name = request.getParameter("author_name");
		String category = request.getParameter("category");
		String numofcopies = request.getParameter("numofcopies");
		String price = request.getParameter("price");


		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/lms"; //MySQL URL and followed by the database name
 		String username = "dbmsproject"; //MySQL username
 		String password = "Dbms@35_42"; //MySQL password
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password); 
 		System.out.println("Printing connection object "+conn);

 		PreparedStatement stmt1 = conn.prepareStatement("select * from book where book_id = ?");
 		stmt1.setString(1, book_id);
 		ResultSet myrs=stmt1.executeQuery();
 		int c=0 ;
 		while(myrs.next()) {
			String s=myrs.getString("book_id");
			if (s.equals(book_id)) c++;
		}
 		System.out.println(c);
 		if(c>0) {
 			RequestDispatcher rd1 = request.getRequestDispatcher("Wrong.jsp");
			rd1.forward(request, response);
 		}
 		else {
		PreparedStatement smt = conn .prepareStatement("insert into book values(?,?,?,?,?,?)");
 		smt.setString(1,book_id);
		smt.setString(2,book_name);
		smt.setString(3,author_name);
		smt.setString(4,category);
		smt.setString(6,numofcopies);
		smt.setString(5,price);
		int result=smt.executeUpdate();
		int idnum=Integer.parseInt(book_id);
		for(int i=1;i<=Integer.parseInt(numofcopies);i++) {
			int isbnnum=idnum*1000+i;
			PreparedStatement smt1 = conn .prepareStatement("insert into bookcode values(?,?)");
			smt1.setInt(1, idnum);
			smt1.setInt(2,isbnnum);
			int x=smt1.executeUpdate();
		}
		
		if(result>0)
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("AddResult.jsp");
			rd.forward(request, response);
		}
		
 		}
 
		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}
