package de.nikolaimatijevic.macgenerator;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Simple program to generate a variable number of mac adresses with a custom seperator.
 * @author Nikolai Matijevic
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// Generate as many mac adresses as were specified by the first option
		for (int i = 0; i < Integer.parseInt(args[0]); i++) {	
			// Print out the mac adress
			System.out.println(genMac(args[1]));
		}
	}
	
	/**
	 * Generates a mac address
	 * @param seperator The user specified seperator
	 * @return Uppercase mac address as String
	 */
	private static String genMac(String seperator) {	
		
		String mac = "";
		
		for (int i = 0; i < 6; i++) {
			// Generate random integer between 10 and 255 and convert it to an uppercase hexadecimal
			mac += Integer.toHexString(ThreadLocalRandom.current().nextInt(10, 255 + 1)).toUpperCase();
			
			// Add the seperator unless it was the last value
			if (i != 5) {
				mac += seperator;
			}
		}
		
		return mac;
	}
}
