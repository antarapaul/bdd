package org.cap.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.cap.dao.ILoginDAO;
import org.cap.dao.LoginDAOImpl;
import org.cap.model.LoginBean;
import org.cap.model.PassRequestForm;
import org.cap.model.Routetable;
import org.cap.model.TransactionBean;

public class LoginServiceImpl implements ILoginService {
	ILoginDAO loginDAO = new LoginDAOImpl();
	@Override
	public boolean authorizeUser(LoginBean loginBean) {
		if(loginDAO.authorizeUser(loginBean)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	@Override
	public PassRequestForm createRequest(PassRequestForm passrequestBean) {
		if(loginDAO.createRequest(passrequestBean) != null)
			return passrequestBean;
      return null;
		
	}
	@Override
	public List<Routetable> listAllRoutes() {
		List<Routetable> routeList=new ArrayList<>();
		routeList = loginDAO.listAllRoutes();
		return routeList;
	}
	@Override
	public Routetable addRoute(Routetable newroute) {
		if(loginDAO.addRoute(newroute)!=null) {
			return newroute;
		}
		return null;
	}
	
	@Override
	public List<PassRequestForm> pendingDetails() {
		List<PassRequestForm> pendingList=loginDAO.pendingDetails();
		if(pendingList!=null)
			return pendingList;
		
		return null;
		
	}
	@Override
	public List<PassRequestForm> pendingDetailsOfEmp(String empid) {
		List<PassRequestForm> pendingList=loginDAO.pendingDetailsOfEmp(empid);
		if(pendingList!=null)
			return pendingList;
		return null;
	}
	@Override
	public Integer transaction(TransactionBean transaction) {
		Integer transaction_id=loginDAO.transaction(transaction);
		return transaction_id;
	}
	@Override
	public List<TransactionBean> monthlyReport(LocalDate fdate, LocalDate tdate) {
		List<TransactionBean> tBean=loginDAO.monthlyReport(fdate, tdate);
		if(tBean!=null)
			return tBean;
		return null;
	
	}

}
