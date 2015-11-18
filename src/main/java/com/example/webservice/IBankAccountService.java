package com.example.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.example.domain.UserDetails;

@WebService
public interface IBankAccountService {

	public UserDetails getUserDetails(@WebParam(name="userName") final String username);

	public void addUserDetails(@WebParam(name="user") final UserDetails user);
	
}
