package eeee;

import java.util.ArrayList;
import java.util.Arrays;


public class Encrypt {
	
	
	public static StringBuilder encryptString(StringBuilder testString) {
		StringBuilder savedEncrypt=new StringBuilder();
		for(int i =0; i<testString.length(); i++) {
			savedEncrypt.append((int) testString.charAt(i)).append("*");
		}
		
		return savedEncrypt;
	}
	
	public static StringBuilder decryptString(StringBuilder encryptedString) {
		
		
		StringBuilder dencryptedResult = new StringBuilder();
		
		ArrayList<String> listString = new ArrayList<>();
		
		listString.addAll(Arrays.asList(encryptedString.toString().split("[*]")));
		
		//String[] dencryptedString = new String[listString.size()];
		//dencryptedString = listString.toArray(dencryptedString);
		
		for(String item : listString) {
			
			dencryptedResult.append((char) Integer.parseInt(item));
		}
		
		return dencryptedResult;
		
	}

}
