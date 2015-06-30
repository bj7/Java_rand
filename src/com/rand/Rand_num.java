package com.rand;
/**
 * Created by joshuabernitt on 6/29/15.
 */
public class Rand_num {
	private long value;
	private float seed;

	/**
	 * Default constructor
	 */
	public Rand_num() {
		this.value = 0;
		this.seed = 0;
	}

	/**
	 * Secondary constructor to accept in seed for random number
	 * @param seed
	 */
	public Rand_num(float seed) {
		this.seed = seed;
	}

	/**
	 * Returns the value of the number
	 * @return long
	 */
	public long getValue() {
		return this.value;
	}


}
