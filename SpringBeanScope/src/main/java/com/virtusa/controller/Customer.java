package com.virtusa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.virtusa.scope.RequestScope;
import com.virtusa.scope.SessionScope;

@Component
public class Customer {

	@Autowired
	private RequestScope dataRequestScope;
	
	@Autowired
	private SessionScope dataSessionScope;

	public RequestScope getDataRequestScope() {
		return dataRequestScope;
	}

	public void setDataRequestScope(RequestScope dataRequestScope) {
		this.dataRequestScope = dataRequestScope;
	}

	public SessionScope getDataSessionScope() {
		return dataSessionScope;
	}

	public void setDataSessionScope(SessionScope dataSessionScope) {
		this.dataSessionScope = dataSessionScope;
	}


}
