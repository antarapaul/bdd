package org.cap.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cap.model.TransactionBean;
import org.cap.service.ILoginService;
import org.cap.service.LoginServiceImpl;
@WebServlet("/MonthlyReportServlet")
public class MonthlyReportServlet extends HttpServlet {
	private ILoginService busservice=new LoginServiceImpl();
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fdate=request.getParameter("fdate");
		String tdate=request.getParameter("tdate");
		String[] dpart=fdate.split("-");
		PrintWriter pw=response.getWriter();
		
		LocalDate fromDate=LocalDate.of(Integer.parseInt(dpart[0]),Integer.parseInt(dpart[1]), Integer.parseInt(dpart[2]));
		
		String[] dpart1=tdate.split("-");
		
		LocalDate toDate=LocalDate.of(Integer.parseInt(dpart1[0]),Integer.parseInt(dpart1[1]), Integer.parseInt(dpart1[2]));
		
		
		List<TransactionBean> tList=busservice.monthlyReport(fromDate, toDate);
		
		pw.println("<html><body><h3 align='center'>Monthly Report</h3>");
		pw.println("<table>"
				+ "<tr>"
				+ "<th>Transaction Id</th>"
				+"<th>Empid</th>"
				+"<th>Transaction date</th>"
				+"<th> Distance</th>"
				+"<th> Total Fare</th>"
				+"<th> Route Id</th>"
				+ "</tr>");

		for(TransactionBean t:tList) {
			pw.println("<tr>"
					+ "<td>"+t.getTransactionId()+"</td>"
					
					+ "<td>"+t.getEmpId()+"</td>"
					+ "<td>"+t.getTransactionDate()+"</td>"
					+ "<td>"+t.getTotalKm()+"</td>"
					+ "<td>"+t.getMonthlyFare()+"</td>"
					+ "<td>"+t.getRouteId()+"</td>"
					
					);
		}
		pw.println("</table></body></html>");
		
		
		
	}

}