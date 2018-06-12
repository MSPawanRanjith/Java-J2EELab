import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ITReturns")
public class ITReturns extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ITReturns() {
        //super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name;
		Float tax,income;
		
		name=request.getParameter("name");
		System.out.println(name);
		income=Float.parseFloat(request.getParameter("salary"));
		tax=Float.parseFloat(request.getParameter("tax"));
		
		PrintWriter out= new PrintWriter("F:\\eclipseproject\\ITReturn\\output.txt");
		out.write(name+"\n"+income+"\n"+tax);
		out.close();
		
		PrintWriter pw= response.getWriter();
		pw.println(name+"\n"+income+"\n"+tax);
		
		
	}

}
