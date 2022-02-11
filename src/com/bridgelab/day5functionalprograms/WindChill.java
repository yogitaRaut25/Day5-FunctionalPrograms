package com.bridgelab.day5functionalprograms;

public class WindChill {
	public static double temp,windSpeed,windChill;
	public static void checkWindChill(double temp,double windSpeed) {
		if(temp<50 || windSpeed<120 || windSpeed>3)
		{
		 windChill=35.74 + (0.6215*temp) + (0.4275*temp * (Math.pow (windSpeed,0.16))-35.75 * (Math.pow(windSpeed,0.16)));
			System.out.println("WindChill= "+windChill);
		}
		else 
			System.out.println(" Invalid input  ");
	}

	public static void main(String[] args) {
		//taking command-line arguments
		double temp=Double.parseDouble(args[0]);
		double windSpeed=Double.parseDouble(args[1]);
		checkWindChill(temp,windSpeed);//calling function
	}
}
