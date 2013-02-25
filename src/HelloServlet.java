import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException {
		super.init();
		TruckList.init();
	}
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        String json = TruckList.asJson();
		out.println(json);
    }

   
}