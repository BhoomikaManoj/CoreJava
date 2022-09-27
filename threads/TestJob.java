package com.uttara.threads;

import java.util.ArrayList;
import java.util.List;

public class TestJob {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(20);
		list.add(30);
		
		
		JobList jl = new JobList(list);
		Thread t1 = new Thread(jl);
		t1.start();

	}

}
