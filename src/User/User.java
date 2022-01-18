package User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
	
	String firstName;
	String lastName;
	String completeAdress;
	LocalDate bornDate;
	Boolean paymentSituation;
	
	public User(String firstName, String lastName, String completeAdress, LocalDate bornDate, Boolean paymentSituation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.completeAdress = completeAdress;
		this.bornDate = bornDate;
		this.paymentSituation = paymentSituation;
	}

	public User() {
	}
	
	public String printUserNames() {
		return this.firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompleteAdress() {
		return completeAdress;
	}

	public void setCompleteAdress(String completeAdress) {
		this.completeAdress = completeAdress;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}

	public Boolean getPaymentSituation() {
		return paymentSituation;
	}

	public void setPaymentSituation(Boolean paymentSituation) {
		this.paymentSituation = paymentSituation;
	}

}
