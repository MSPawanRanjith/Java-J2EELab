

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TShirtBuy")
public class TShirtBuy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    static String DRIVER="com.mysql.jdbc.Driver";
    // static String DRIVER="com.mysql.jdbc.Driver";
    static String DBURL="jdbc:mysql://localhost:3306/pwn";
    //static String DBURL="jdbc:mysql://localhost:3306/pwn";
    static String USR="root";
    static String PASS="network";
    
    Connection conn;
    public TShirtBuy() {
        //super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String acessoriess="";
		try {
			
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(DBURL, USR, PASS);
			
			for (String x : request.getParameterValues("acc")) {
				acessoriess+=x;
			}
			PreparedStatement ps=conn.prepareStatement("insert into tshirt values(?,?,?,?,?);");
			ps.setInt(1,0);
			ps.setString(2,request.getParameter("tag"));
			ps.setString(3,acessoriess);
			ps.setString(4, request.getParameter("pocket"));
			ps.setString(5, request.getParameter("color"));
			
			int c=ps.executeUpdate();
			System.out.println("Updated : "+c);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to Connect");
			e.printStackTrace();
		}
		
	}

}
