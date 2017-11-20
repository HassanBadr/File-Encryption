package encrypt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws IOException {
/*
		
*/
		String resultText="";
		String resultEncrypt="";
		//read file 
		File readFile = new File("TestFile.txt");
		Scanner readFromFile = new Scanner(readFile);
		
		while (readFromFile.hasNextLine()) {
			 resultText += readFromFile.nextLine()+"\n"; 
			
		}
		System.out.println("Encription  process...");
		resultEncrypt = Encrypt.encryptString(resultText);
		
		System.out.print(resultText);
		System.out.println("for testing: "+resultEncrypt);
		System.out.println("------------------------------------------------");
		
		//write encrypt file
		File newFile = new File("encryptFile.txt");
		PrintWriter writeText = new PrintWriter(newFile);
		writeText.print(resultEncrypt);
		writeText.close();
		System.out.println("\nDencription file process...");
		System.out.print(dencryptFile(newFile));
		
		readFromFile.close();
	}
	
	public static String dencryptFile(File file)throws IOException {
		Scanner read = new Scanner(file);
		String resultText="";
		while(read.hasNextLine()) {
			resultText +=read.nextLine();
		}
		read.close();
		return Encrypt.decryptString(resultText);
	}

}
