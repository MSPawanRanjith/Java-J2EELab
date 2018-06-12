

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    static String DRIVER="com.mysql.jdbc.Driver";
    static String DBURL="jdbc:mysql://localhost:3306/pwn";
    static String USR ="root";
    static String PASS="network";
    static Connection conn;
	
	public Search() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(DBURL,USR,PASS);
		
			Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			if(request.getParameter("name").equals("")){
				if(request.getParameter("phone").equals("")){
					System.out.println("No selection made");
				}
				else{
					String query="select * from phonebook where phone='"+request.getParameter("phone")+"';";
					ResultSet rs=stmt.executeQuery(query);
					
					while(rs.next()){
						PrintWriter printWriter=response.getWriter();
						for(int i=1;i<=2;i++){
							printWriter.println(rs.getString(i));
						}
					}
				}
			}
			else{
				String query="select * from phonebook where name ='"+request.getParameter("name")+"';";
				ResultSet rs=stmt.executeQuery(query);
				
				while(rs.next()){
					PrintWriter printWriter=response.getWriter();
					for(int i=1;i<=2;i++){
						printWriter.println(rs.getString(i));
					}
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}

}
