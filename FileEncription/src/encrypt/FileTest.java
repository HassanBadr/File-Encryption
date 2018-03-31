package encrypt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws IOException {
/*
		
*/
		StringBuilder resultText=new StringBuilder();
		StringBuilder resultEncrypt=new StringBuilder();
		//read file 
		File readFile = new File("TestFile.txt");
		Scanner readFromFile = new Scanner(readFile);
		
		while (readFromFile.hasNextLine()) {
			 resultText.append(readFromFile.nextLine()+"\n"); 
			
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
	
	public static StringBuilder dencryptFile(File file)throws IOException {
		Scanner read = new Scanner(file);
		StringBuilder resultText=new StringBuilder();
		
		while(read.hasNextLine()) {
			resultText.append(read.nextLine());
		}
		read.close();
		return Encrypt.decryptString(resultText);
	}

}
