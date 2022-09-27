package com.uttara.threads;

public class PrintThread extends Thread {

	public void run() {

		String str = null;
//		int len = str.length();

		try {
			int len = str.length();
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(500);
				System.out.println("Thread " + i + "-----> " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}

class TestThread {
	public static void main(String[] args) {

		System.out.println("Starting main()");

		System.out.println(Thread.currentThread().getName());

		PrintThread pt = new PrintThread();
		PrintThread pt2 = new PrintThread();
		pt.setName("Earth");
		pt2.setName("Dhathri");

		pt.start();
		pt2.start();
		pt.setPriority(2);
		pt2.setPriority(1);

//		pt.run();
		System.out.println("Ending main()");

	}

}
