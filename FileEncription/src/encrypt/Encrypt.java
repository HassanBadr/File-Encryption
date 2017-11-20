package encrypt;

import java.util.ArrayList;
import java.util.Arrays;


public class Encrypt {
	
	
	public static String encryptString(String testString) {
		String savedEncrypt="";
		for(int i =0; i<testString.length(); i++) {
			savedEncrypt +=(int) testString.charAt(i) +"*";
		}
		
		return savedEncrypt;
	}
	
	public static String decryptString(String encryptedString) {
		
		
		String dencryptedResult = "";
		
		ArrayList<String> listString = new ArrayList<>();
		
		listString.addAll(Arrays.asList(encryptedString.split("[*]")));
		String[] dencryptedString = new String[listString.size()];
		
		dencryptedString = listString.toArray(dencryptedString);
		
		for(String item : dencryptedString) {
			
			dencryptedResult +=(char) Integer.parseInt(item);
		}
		
		return dencryptedResult;
		
	}

}
