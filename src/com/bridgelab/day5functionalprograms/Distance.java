package com.bridgelab.day5functionalprograms;

public class Distance {
	public static void EuclideanDistance(double x,double y) {
		double distance = Math.sqrt((x*x) + (Math.pow(y,2)));
		System.out.println("Euclidean Distance = "+distance);
	}

	public static void main(String[] ar) {
		//taking command-line arguments
		double x=Double.parseDouble(ar[0]);
		double y=Double.parseDouble(ar[1]);
		//calling method from main
		EuclideanDistance(x,y);

	}

}
