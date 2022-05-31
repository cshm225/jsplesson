package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;

/**
 * Servlet implementation class Minatoindex
 */
@WebServlet("/Minatoindex")
public class Minatoindex extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Minatoindex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application=this.getServletContext();
		SiteEV siteEV=(SiteEV) application.getAttribute("siteEV");
		if(siteEV==null) {
			siteEV=new SiteEV();

		}
		request.setCharacterEncoding("UTF-8");
		String action=request.getParameter("action");
		SiteEVLogic sel=new SiteEVLogic();
		if(action!=null&&action.equals("like")) {
			sel.like(siteEV);
		}else if(action!=null&&action.equals("dislike")) {
			sel.dislike(siteEV);
		}
		application.setAttribute("siteEV", siteEV);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/lib/minatoindex.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
