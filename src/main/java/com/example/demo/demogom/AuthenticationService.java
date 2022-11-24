package com.example.demo.demogom;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isVaildname =username.equalsIgnoreCase("Gom");
		boolean isValidpassword = password.equalsIgnoreCase("Gom");
		return isVaildname && isValidpassword;
	}
}
