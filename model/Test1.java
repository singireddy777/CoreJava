package com.example.helloworld.model;

import java.util.Base64;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.decodePassword("UE1UQXJjaGl0ZWN0dXJlMTIz");
		// String password = "PMTArchitecture123";
		t.encodePassword("$tr0n9e@t7eam");

//        byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
//        String encodedPassword = new String(encodedBytes);
//        System.out.println("Encoded password: " + encodedPassword);
	}

	public String decodePassword(String encodedPassword) {

		byte[] decodedBytes = Base64.getDecoder().decode(encodedPassword);
		String decodedPassword = new String(decodedBytes);
		System.out.println("the decoded password is: " + decodedPassword);
		return decodedPassword;
	}

	public String encodePassword(String normalPassword) {

		String encodedPassword1 = Base64.getEncoder().encodeToString(normalPassword.getBytes());
		System.out.println("the encoded password is: " + encodedPassword1);
		return encodedPassword1;
	}
}