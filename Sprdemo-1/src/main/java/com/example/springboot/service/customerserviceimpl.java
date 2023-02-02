package com.example.springboot.service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.example.springboot.dao.*;
import com.example.springboot.model.*;
import java.util.List;

@Service

public abstract class customerserviceimpl {
	@Autowired
	private customerdaoImpl cdimp;
	//@Override
	public List<customer>getAllcustomerDetails() throws Exception
	{
		List<customer>clist=cdimp.getAllcustomerDetails();
		if(clist==null) {
			throw new Exception("No customer Available");
		}
		return clist;
	}
	public customer getcustomer(Integer customerId) throws Exception
	{
		customer cdetails=cdimp.getcustomer(customerId);
		if(cdetails==null)
		{
			throw new Exception("No customer Available with this customerid"+customerId);
		}
		return cdetails;
	}
	
	public void addcustomer(customer c) throws Exception
	{
		if(cdimp.getcustomer(c.getCustomerId())!=null)
		{
			throw new Exception("customer already Exist");
		}
	}
	
	public void updateEmail(int customerId,String customerEmail) throws Exception
	{
		customer cdetails=cdimp.getcustomer(customerId);
		if(cdetails==null)
		{
			throw new Exception("No customer Available with this customerid"+customerId);
		}
		cdimp.updateEmail(customerId, customerEmail);
	}
	
	public void updatePhone(int customerId,int customerPhone) throws Exception
	{
		customer cdetails=cdimp.getcustomer(customerId);
		if(cdetails==null)
		{
			throw new Exception("No customer Available with this customerid"+customerId);
		}
		cdimp.updatePhone(customerId, customerPhone);
	}
	
	public void removeCustomer(int customerId) throws Exception
	{
		customer cdetails=cdimp.getcustomer(customerId);
		if(cdetails==null)
		{
			throw new Exception("No customer Available with this customerid"+customerId);
		}
		cdimp.removeCustomer(customerId);
	}	
}