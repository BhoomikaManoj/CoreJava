package com.uttara.threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountWordsInFile implements Runnable {

	private String path;
	private int numOfWords;

	public int getNumOfWords() {
		return numOfWords;
	}

	public CountWordsInFile(String path) {
		super();
		this.path = path;
	}

	@Override
	public void run() {
		File f = new File(path);
		if (f.exists() && f.isFile() && f.getName().contains(".txt"))
			numOfWords = countWordsInFile(f);
		else {
			if (f.exists() && f.isDirectory()) {
				File[] fa = f.listFiles();
				for (File fi : fa) {
					int val = countWordsInFile(fi);
					numOfWords += val;
				}
			}
		}

	}

	public static int countWordsInFile(File f) {
		int count = 0;
		if (f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				while ((line = br.readLine()) != null)
					count += line.split(" ").length;
				return count;

			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (Exception e2) {
						e2.printStackTrace();

					}
				}
			}

		}
		return count;
	}

}
