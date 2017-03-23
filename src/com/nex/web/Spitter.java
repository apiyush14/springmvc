package com.nex.web;

import org.springframework.stereotype.Component;

@Component
public class Spitter {
 public String firstName;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}
}
