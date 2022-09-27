package com.uttara.threads;

public class TestParamJobThread {

	public static void main(String[] args) {

		ParamJobThread pj1 = new ParamJobThread();
		Thread t1 = new Thread(pj1);
		t1.run();

		System.out.println("---------" + pj1.getOutput());

	}

}
