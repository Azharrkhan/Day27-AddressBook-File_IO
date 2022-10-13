package com.bl.addressbook;

import java.util.Scanner;

public class Address {

	String firstName, lastName, address, city, state, eMail;
	long zip, phoneNumber;
	Scanner sc = new Scanner(System.in);

	public void addContact() {
		System.out.println("Enter First name");
		firstName = sc.next();
		System.out.println("Enter Last name");
		lastName = sc.next();
		System.out.println("Enter Address");
		address = sc.next();
		System.out.println("Enter City");
		city = sc.next();
		System.out.println("Enter State");
		state = sc.next();
		System.out.println("Enter Email");
		eMail = sc.next();
		System.out.println("Enter Zip code");
		zip = sc.nextLong();
		System.out.println("Enter Phone number");
		phoneNumber = sc.nextLong();
	}

	@Override
	public String toString() {
		return " firstName=" + firstName + ",\n lastName=" + lastName + ",\n address=" + address + ",\n city=" + city
				+ ", \n state=" + state + ",\n eMail=" + eMail + ", \n zip=" + zip + ",\n phoneNumber=" + phoneNumber
				+ ",]";
	}
}
