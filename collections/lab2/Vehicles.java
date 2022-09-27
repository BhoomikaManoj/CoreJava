package com.uttara.collections.lab2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Vehicles {

	String name;
	int engineBHP;
	public Vehicles(String name, int engineBHP) {
		super();
		this.name = name;
		this.engineBHP = engineBHP;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Vehicles)
		{
			Vehicles v = (Vehicles) obj;
			if(this.name.equals(v.name) && this.engineBHP == v.engineBHP)
				return true;
			else
				return false;
		}
		return false;
	}
}

class TestVehicles
{
	
	public static void main(String[] args) {
		
		Vehicles v1 = new Vehicles("Car", 3);
		Vehicles v2 = new Vehicles("Bus", 4);
		Vehicles v3 = new Vehicles("Car", 3);
		Vehicles v4 = new Vehicles("Bus", 4);
		
//		System.out.println("v1 == v2 : "+ (v1 == v2));
//		System.out.println("v1.equals(v2) : "+ v1.equals(v2));
//		System.out.println("v1 == v3 : "+ (v1 == v3));
//		System.out.println("v1.equals(v3) : "+v1.equals(v3));
		
		Collection<Vehicles> arr1 = new ArrayList<Vehicles>();
		arr1.add(v1);
		arr1.add(v2);
		
		List<Vehicles> arr2 = new ArrayList<Vehicles>();
		arr2.add(v3);
		arr2.add(v4);
		
		System.out.println("Array List compare : "+arr1.equals(arr2));
	}

}
