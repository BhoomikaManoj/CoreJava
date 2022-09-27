package com.uttara.collections.lab2;

import java.util.Set;
import java.util.TreeSet;

public class VehiclesTreeSet implements Comparable<VehiclesTreeSet> {
	
	String name;
	int engineBHP;
	
	public VehiclesTreeSet(String name, int engineBHP) {
		super();
		this.name = name;
		this.engineBHP = engineBHP;
	}
	
	@Override
	public String toString() {
		return "VehiclesTreeSet [name=" + name + ", engineBHP=" + engineBHP + "]";
	}
	
	 public int compareTo(VehiclesTreeSet vt)
	{
//		 System.out.println(this.engineBHP);
//		 System.out.println(vt.engineBHP);
//		 System.out.println("-----------------");
		if(this.engineBHP == vt.engineBHP)
			return 0;
		else if(this.engineBHP > vt.engineBHP)
			return 1;
		else 
			return -1;
	}
}

class TestVehiclesTreeSet
{
	public static void main(String[] args) {
		VehiclesTreeSet vt1 = new VehiclesTreeSet("Car", 3);
		VehiclesTreeSet vt2 = new VehiclesTreeSet("Jeep", 4);
		VehiclesTreeSet vt3 = new VehiclesTreeSet("Car", 2);
		VehiclesTreeSet vt4 = new VehiclesTreeSet("Jeep", 1);

		Set<VehiclesTreeSet> tree1 = new TreeSet<VehiclesTreeSet>();
//		Set<VehiclesTreeSet> tree2 = new TreeSet<VehiclesTreeSet>();
		
		tree1.add(vt1);
		tree1.add(vt2);
		tree1.add(vt3);
		tree1.add(vt4);
		
//		System.out.println(tree1);
		
		for(VehiclesTreeSet vt : tree1)
			System.out.println(vt);
		
	}

}
