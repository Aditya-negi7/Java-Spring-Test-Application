package com.example.springboot.dao;
import java.util.List;

import com.example.springboot.model.customer;

public interface customerdaoImpl {
	public List<customer>getAllcustomerDetails();
	
	public customer getcustomer(int customerID);
	public void addCustomer(customer c);
	public void updateEmail(int customerId,String customerEmail);
	public void updatePhone(int customerId,int customerPhone);
	public void removeCustomer(int customerId);
}