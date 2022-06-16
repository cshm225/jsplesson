package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Age;

/**
 * Servlet implementation class AgeData
 */
@WebServlet("/AgeData")
public class AgeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgeData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String yearString=request.getParameter("year");
		String monthString=request.getParameter("month");
		String dayString=request.getParameter("day");

		yearString=yearString==null?"0":yearString;
		monthString=monthString==null?"0":monthString;
		dayString=dayString==null?"0":dayString;
		Date date = new Date();
//今年のやつー
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(date);
        int tYear=Integer.parseInt(currentYear);
        SimpleDateFormat getMonthFormat = new SimpleDateFormat("MM");
        String currentMonth=getMonthFormat.format(date);
        int tMonth=Integer.parseInt(currentMonth);
        SimpleDateFormat getDayFormat = new SimpleDateFormat("dd");
        String currentDay=getDayFormat.format(date);
        int tDay=Integer.parseInt(currentDay);

		int year=Integer.parseInt(yearString);
		int month=Integer.parseInt(monthString);
		int day=Integer.parseInt(dayString);
		int age=tYear-year;
		if((tMonth*100+tDay)<(month*100+day)) {
			age--;
		}
		//nyuugaku sotugyou
		int enterhSchool=year+16;
		if(month==1||month==2||month==3) {
			enterhSchool--;
		}
		int graduationhSchool=enterhSchool+3;
		int enterUnivercity=graduationhSchool;
		int gUnivercity=enterUnivercity+4;

		Age a=new Age();
		a.setAge(age);
		a.setDay(day);
		a.setMonth(month);
		a.setYear(year);
		a.setEnterhSchool(enterhSchool);
		a.setGraduationhSchool(graduationhSchool);
		a.setEnterUnivercity(enterUnivercity);
		a.setgUnivercity(gUnivercity);



		response.setContentType("application/json;charset=utf-8");
		PrintWriter out=response.getWriter();
		Gson gson=new Gson();
		out.print(gson.toJson(a));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
