package de.nikolaimatijevic.macgenerator;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Simple program to generate a variable number of mac adresses with a custom separator.
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
	 * @param separator The user specified separator
	 * @return Uppercase mac address as String
	 */
	private static String genMac(String separator) {	
		
		String mac = "";
		
		for (int i = 0; i < 6; i++) {
			// Generate random integer between 16 and 255 and convert it to an hexadecimal
			mac += Integer.toHexString(ThreadLocalRandom.current().nextInt(16, 255 + 1)).toUpperCase();
			
			// Add the separator unless it was the last value
			if (i != 5) {
				mac += separator;
			}
		}
		
		return mac;
	}
}
