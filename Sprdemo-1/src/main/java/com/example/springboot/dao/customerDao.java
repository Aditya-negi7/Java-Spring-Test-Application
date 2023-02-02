package com.example.springboot.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.example.springboot.model.customer;

public abstract class customerDao implements customerdaoImpl
{
	private Map<Integer,customer> customers=new HashMap<Integer,customer>();
	public customerDao()
	{
		customers.put(101,new customer(100,"aditya","aditya@gmail.com",1234567));
		customers.put(101,new customer(101,"ankit","ankit@gmail.com",1256576));
	
	}
	
	@Override
	public List<customer> getAllcustomerDetails() {
		return new ArrayList<customer>(customers.values());
	}
	
	@Override
	public customer getcustomer(int customerID)
	{
		return customers.get(customerID);
	}
	
	@Override
	public void addCustomer(customer customer)
	{
		customers.put(customer.getCustomerId(),customer);
	}
	
	@Override
	public void updateEmail(int customerId,String customerEmail)
	{
		customers.get(customerId).setCustomerEmail(customerEmail);
	}
	
	@Override
	public void updatePhone(int customerId,int customerPhone)
	{
		customers.get(customerId).setCustomerPhone(customerPhone);
	}
	
	@Override
	public void removeCustomer(int customerId)
	{
		customers.remove(customerId);
	}
	
}