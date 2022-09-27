package com.uttara.collections.lab2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class VehiclesHashSet {

	String name;
	int engineBHP;
	public VehiclesHashSet(String name, int engineBHP) {
		super();
		this.name = name;
		this.engineBHP = engineBHP;
	}
	
	@Override
	public String toString() {
		return "VehiclesHashSet [name=" + name + ", engineBHP=" + engineBHP + "]";
	}

	@Override
	public int hashCode() {
		//return Objects.hash(engineBHP, name);
		return (name + engineBHP).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj instanceof VehiclesHashSet)
		{
			VehiclesHashSet v = (VehiclesHashSet) obj;
			if(this.name.equals(v.name) && this.engineBHP == v.engineBHP)
				return true;
			else
				return false;
		}
		return false;
	}
	
}

class TestVehiclesHashSet 
{
	public static void main(String[] args) {
		
		
		VehiclesHashSet vh1 = new VehiclesHashSet("Car", 3);
		VehiclesHashSet vh2 = new VehiclesHashSet("Jeep", 4);
		VehiclesHashSet vh3 = new VehiclesHashSet("Car", 3);
		VehiclesHashSet vh4 = new VehiclesHashSet("Jeep", 4);
		
		HashSet<VehiclesHashSet> s1 = new HashSet<VehiclesHashSet>();
		s1.add(vh1);
		s1.add(vh2);
		s1.add(vh3);
		s1.add(vh4);
		
		for(VehiclesHashSet v : s1)
			System.out.println(v);
		System.out.println(vh2.hashCode());
		System.out.println(vh4.hashCode());
	}

}
