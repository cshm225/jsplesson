package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Slime;

/**
 * Servlet implementation class SlimeApp
 */
@WebServlet("/SlimeApp")
public class SlimeApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SlimeApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Slime s=new Slime(100,"slime");
		List<Slime> slime=new ArrayList<>();
		slime.add(new Slime(10,"A"));
		slime.add(new Slime(20,"B"));
		slime.add(new Slime(30,"C"));
		request.setAttribute("slime",slime);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/result.jsp");
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
