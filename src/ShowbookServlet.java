import java.io.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
import java.sql.*;  
@WebServlet("/ShowbookServlet")
public class ShowbookServlet extends HttpServlet  
{    
	private static final long serialVersionUID = 1L;
	   
    public ShowbookServlet() {
        super();
        
    }
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
        	 Connection conn = null;
     		String url = "jdbc:mysql://localhost:3306/lms"; //MySQL URL and followed by the database name
      		String username = "dbmsproject"; //MySQL username
      		String password = "Dbms@35_42"; //MySQL password
     		
     		Class.forName("com.mysql.cj.jdbc.Driver");
     		conn = DriverManager.getConnection(url, username, password); 
      		System.out.println("Printing connection object "+conn);
             Statement stmt = conn.createStatement();  
             ResultSet rs = stmt.executeQuery("select book_name, author_name, category from book");  
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>book_name</th><th>author_name</th><th>category</th><tr>");  
             while (rs.next()) 
             {  
                 String n = rs.getString("book_name");  
                 String nm = rs.getString("author_name");  
                 String s = rs.getString("category");   
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             conn.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
     }  
 } 