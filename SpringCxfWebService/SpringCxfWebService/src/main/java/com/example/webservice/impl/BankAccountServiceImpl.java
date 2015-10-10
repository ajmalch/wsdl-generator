package com.example.webservice.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


import javax.jws.WebService;

import com.example.webservice.IBankAccountService;
import com.example.webservice.UserDetails;

@WebService(endpointInterface="com.example.webservice.IBankAccountService")
public class BankAccountServiceImpl implements IBankAccountService {

	Map<String,UserDetails> users=new HashMap<>();
	
	@Override
	public UserDetails getUserDetails(String userName) {
		
		UserDetails user=users.get(userName);
		return user;
	}

	@Override
	public void addUserDetails(UserDetails user) {
		users.put(user.getName(), user);
		System.out.println("User Added" +user.getName());
		
	}

}
