package de.nikolaimatijevic.dummymac;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < Integer.parseInt(args[0]); i++) {
			
			System.out.println(genMac(args[1]));
			
		}
		
	}
	
	private static String genMac(String seperator) {
		
		String mac = "";
		
		for (int i = 0; i < 12; i++) {
			
			mac += Integer.toHexString(ThreadLocalRandom.current().nextInt(0, 15 + 1)).toUpperCase();
			
			if (i % 2 != 0 && i != 11) {
				
				mac += seperator;
				
			}
			
		}
		
		return mac;
		
	}

}
