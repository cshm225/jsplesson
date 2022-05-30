package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/lib/healthcheck.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String height=request.getParameter("height");
		String weight=request.getParameter("weight");
		double height1=Double.parseDouble(height);
		double weight1=Double.parseDouble(weight);

		Health h=new Health(height1,weight1);
		//bmikeisan
		HealthCheckLogic hcl=new HealthCheckLogic(h);

		//kekkadaasu
		request.setAttribute("bmi",hcl);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/lib/healthcheckresult.jsp");
		rd.forward(request,response);

	}

}
