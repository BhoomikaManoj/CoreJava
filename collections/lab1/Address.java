package com.uttara.collections.lab1;

public class Address {

	String city;
	String street;
	int pin;
	int zip;
	public Address(String city, String street, int pin, int zip) {
		super();
		this.city = city;
		this.street = street;
		this.pin = pin;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pin=" + pin + ", zip=" + zip + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Address)
		{
			Address addr = (Address) obj;
			if(this.city.equals(addr.city) && this.street.equals(addr.street) && this.pin == addr.pin && this.zip == addr.zip)
				return true;
			else
				return false;
		}
		return false;
	}
}
