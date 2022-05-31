package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Tform;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath=null;
		String action=request.getParameter("action");
		if(action==null) {
			forwardPath="/WEB-INF/lib/tform.jsp";
		}else if(action.equals("done")) {
			HttpSession session=request.getSession();
			Tform tform=(Tform)session.getAttribute("tform");
			session.removeAttribute("tform");
			session.invalidate();
			forwardPath="WEB-INF/lib/kanryo.jsp";

		}
		RequestDispatcher dispatcher=request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String otoiawase=request.getParameter("otoiawase");
		Tform tform=new Tform(name,address,otoiawase);

		HttpSession session=request.getSession();
		session.setAttribute("tform",tform);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/lib/kakunin.jsp");
		rd.forward(request, response);
		}

}
