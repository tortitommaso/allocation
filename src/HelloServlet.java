import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException {
		super.init();
		TrackList.init();
	}
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        String trucknumber = req.getParameter("trucknumber");
        Truck truck = TrackList.find(trucknumber);
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/plain");
        out.println(truck.status());
    }

   
}