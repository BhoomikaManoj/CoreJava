package com.uttara.threads;

public class ParamJobThread extends Thread {

	int output;

	public int getOutput() {
		return output;
	}

	@Override
	public void run() {
		output = (int) (Math.random() * 1000000);
	}
}
