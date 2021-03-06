package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser {

	private Integer employeeID = super.getId();
	private String role;
	private ArrayList<String> securityIncidents;

	public AdminUser(Integer id, int pin) {
		super(id, pin);
		// TODO Auto-generated constructor stub
	}

	public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
	}
	public AdminUser(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}


	public AdminUser(Integer id, int pin, Integer employeeID, String role, ArrayList<String> securityIncidents) {
		super(id, pin);
		this.employeeID = employeeID;
		this.role = role;
	}

	@Override
	public boolean assignPin(int pin) {
		if (pin > 1000) {
			super.setPin(pin);
			
			return true;
		}
		else{
			System.out.println("Pin must be atleast 4 letters");
			return false;
		}
		
	}
	


	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.pin == confirmedAuthID) {
			System.out.println("correct Pin");
			return true;
		}
		else {
			System.out.println("incorrect Pin");
			authIncident();
			return false;	
		}
		
	}

	public void newIncident(int i) {
		String report = String.format("Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", new Date(),
				this.id, i);
		setSecurityIncidents(report);
	}

	public void authIncident() {
		String report = String.format("Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", new Date(), this.id,
				"AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
		setSecurityIncidents(report);
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		super.setId(employeeID);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}



	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(String securityIncidents) {
		this.securityIncidents.add(securityIncidents);

	}



}
