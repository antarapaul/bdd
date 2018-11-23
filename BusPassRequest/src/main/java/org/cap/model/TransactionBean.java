package org.cap.model;
import java.time.LocalDate;

	public class TransactionBean {
		private Integer transactionId;
		private Integer routeId;
		private String empId;
		private LocalDate transactionDate;
		private Double totalKm;
		private Integer monthlyFare;
		
		
		public TransactionBean() {
			super();
		}

		
		
		
		public TransactionBean(Integer routeId, String empId, LocalDate transactionDate, Double totalKm,
				Integer monthlyFare) {
			super();
			this.routeId = routeId;
			this.empId = empId;
			this.transactionDate = transactionDate;
			this.totalKm = totalKm;
			this.monthlyFare = monthlyFare;
		}




	

		public TransactionBean(Integer transactionId, Integer routeId, String empId, LocalDate transactionDate,
				Double totalKm, Integer monthlyFare) {
			super();
			this.transactionId = transactionId;
			this.routeId = routeId;
			this.empId = empId;
			this.transactionDate = transactionDate;
			this.totalKm = totalKm;
			this.monthlyFare = monthlyFare;
		}




		public Integer getTransactionId() {
			return transactionId;
		}




		public void setTransactionId(Integer transactionId) {
			this.transactionId = transactionId;
		}




		public Integer getRouteId() {
			return routeId;
		}




		public void setRouteId(Integer routeId) {
			this.routeId = routeId;
		}




		public String getEmpId() {
			return empId;
		}




		public void setEmpId(String empId) {
			this.empId = empId;
		}




		public LocalDate getTransactionDate() {
			return transactionDate;
		}




		public void setTransactionDate(LocalDate transactionDate) {
			this.transactionDate = transactionDate;
		}




		public Double getTotalKm() {
			return totalKm;
		}




		public void setTotalKm(Double totalKm) {
			this.totalKm = totalKm;
		}




		public Integer getMonthlyFare() {
			return monthlyFare;
		}




		public void setMonthlyFare(Integer monthlyFare) {
			this.monthlyFare = monthlyFare;
		}




		@Override
		public String toString() {
			return "TransactionBean [transactionId=" + transactionId + ", routeId=" + routeId + ", empId=" + empId
					+ ", transactionDate=" + transactionDate + ", totalKm=" + totalKm + ", monthlyFare=" + monthlyFare
					+ "]";
		}




		
		
		

	}


