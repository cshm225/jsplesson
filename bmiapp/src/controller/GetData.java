package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.BMI;

/**
 * Servlet implementation class GetData
 */
@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String heightstr=request.getParameter("height");
		String weightstr=request.getParameter("weight");
		heightstr=heightstr==null?"1":heightstr;
		weightstr=weightstr==null?"0":weightstr;
		double heightCm=Double.parseDouble(heightstr);
		double weightKg=Double.parseDouble(weightstr);
		double bmi=weightKg/Math.pow((heightCm/100) ,2 );
		String filename;
		if(bmi<18.5) {
			filename="img1.jpg";
		}else if(bmi<25) {
			filename="img2.jpg";
		}else if(bmi<30) {
			filename="img3.jpg";
		}else if(bmi<35) {
			filename="img4.jpg";
		}else if(bmi<40) {
			filename="img5.jpg";
		}else {
			filename="img6.jpg";
		}
		String imgPath="http://localhost:8080/bmiapp/images/"+filename;
		BMI b=new BMI();
		b.setHeight(heightCm);
		b.setWeight(weightKg);
		b.setBmi(Math.round(bmi*100)/100d);
		b.setImgPath(imgPath);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out=response.getWriter();
		Gson gson=new Gson();
		out.print(gson.toJson(b));

		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/view/main.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
