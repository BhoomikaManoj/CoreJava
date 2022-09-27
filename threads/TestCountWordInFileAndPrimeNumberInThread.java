package com.uttara.threads;

public class TestCountWordInFileAndPrimeNumberInThread {

	public static void main(String[] args) throws InterruptedException {

		try {

			GeneratePrimeNumber pn = new GeneratePrimeNumber(10000);
			Thread t2 = new Thread(pn);
			t2.start();
			t2.join();
			// implement the job code
			long time1 = System.currentTimeMillis();
			System.out.println("Prime Number : " + pn.getIsPrimeNumber());

			CountWordsInFile cw = new CountWordsInFile("C:/Users/Manu/Desktop");
			Thread t1 = new Thread(cw);
			t1.start();
			t1.join();
			long time2 = System.currentTimeMillis();

			System.out.println("num of word : " + cw.getNumOfWords());
			System.out.println("compare to threads execution time"+(time2 - time1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
