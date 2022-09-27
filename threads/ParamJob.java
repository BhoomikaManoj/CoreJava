package com.uttara.threads;

public class ParamJob implements Runnable {

	int output ;
	
	public int getOutput() {
		return output;
	}

	@Override
	public void run() {
		output = (int)(Math.random()*1000000);
	}
}

class TestParamJob
{

	public static void main(String[] args) throws InterruptedException {
		ParamJob pj = new ParamJob();
		Thread t1 = new Thread(pj);
		t1.start();
		t1.join();
		
		System.out.println(pj.getOutput());
	}

	
}
