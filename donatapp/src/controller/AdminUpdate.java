package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.DonutDAO;
import model.Dounut;

@WebServlet("/Admin/Update")
@MultipartConfig
public class AdminUpdate extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		if(id == null) {
			response.sendRedirect("/donatapp/Admin");
			return;
		}
		DonutDAO dao=new DonutDAO();
		Dounut donut=dao.findOne(Integer.parseInt(id));
		request.setAttribute("donut", donut);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/admin/update.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String orgname=request.getParameter("orgname");
		Part part=request.getPart("imgname");
		String imgname;
		if(part.getSize()==0) {
			imgname=orgname;
		}else {
			imgname=part.getSubmittedFileName();
			String path=getServletContext().getRealPath("/upload");
			part.write(path+File.separator+imgname);
		}
		DonutDAO dao=new DonutDAO();
		dao.updateOne(new Dounut(Integer.parseInt(id),name,Integer.parseInt(price),imgname));
		List<Dounut> list=dao.findAll();
		request.setAttribute("list", list);
		request.setAttribute("msg", "1件更新しました");
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/admin/main.jsp");
		rd.forward(request, response);
	}

}