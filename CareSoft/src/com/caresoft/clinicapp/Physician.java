package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser{
	
	
	public Physician(Integer id, int pin, ArrayList<String> patientNotes) {
		super(id, pin);
		this.patientNotes = patientNotes;
	}
	

	private ArrayList<String> patientNotes;

	public Physician(Integer id, int pin) {
		super(id, pin);
		// TODO Auto-generated constructor stub
	}

	public Physician(int id) {
		super(id);
	}


	 public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }



	@Override
		public boolean assignPin(int pin) {
		System.out.println("you made it");
			if (pin >= 1000) {
				
				this.pin = pin;
				
				return true;
			}
			else {
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
			System.out.println("Incorrect Pin");
			return false;	
		}
		
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	

}
