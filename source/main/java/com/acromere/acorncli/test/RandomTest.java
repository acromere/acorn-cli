package com.acromere.acorncli.test;

import java.util.Random;

public class RandomTest implements Runnable {

	private Random r = new Random();

	@Override
	public void run() {
		r.nextLong();
	}

}
