package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<!DOCUTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title> 結果 </title>");
		out.println("</head>");
		out.println("<body>");
		if(name==null||name.length()==0) {
			out.println("<p>なまえが入力されてません</p>");
		}
		if(age==null||age.length()==0) {//null判定が先
			out.println("<p>年齢が入力されてません</p>");
		}
		if(age!=null && age.length()!=0&&name!=null&&name.length()!=0){
			out.println("<p>"+name+"("+age+"歳)は人間に換算すると"+(Integer.parseInt(age)*7)+"歳です。</p><br>");
		}
		out.println("<a href=\"index.jsp\">戻る</a>");
		out.println("</body>");
		out.println("</html>");

	}

}
