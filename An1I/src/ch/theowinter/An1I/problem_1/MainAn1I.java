package ch.theowinter.An1I.problem_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAn1I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(g(3));
		findDomain();

	}
	
	public static int g(int i) {
		return i%2;
	}
	
	/**
	 * Domain = Definitionsbereich
	 */
	public static void findDomain(){
		print("Der Definitionsbereich ist die Menge aller Zahlen,");
		print("für die es einen Funktionswert gibt.");
		if(yesNo("Können wir negative Zahlen eingebn?")){
			if(yesNo("Können wir Brüche eingeben?")){
				if(yesNo("Müssen diese Brüche irrationals sein? z.B. Pi")){
					print("Irrationale Zahlen - IR");
				}
				else if(yesNo("Können diese Brüche irrational und rational sein?")){
					print("Reelle Zahlen - R");
				}
				else{
					print("Rationale Zahlen - Q");
				}
			}
			else{
				print("Ganze Zahlen - Z");
			}
		}
		else{
			if(yesNo("Können wir die 0 eingben?")){
				print("Natürliche Zahlen mit 0 -  N0");
			}
			else{
				print("Natürliche Zahlen ohne 0 - N/0");
			}
		}
	}
	
	public static void print(String input){
		System.out.println(input);
	}
	
	public static boolean yesNo(String question){
		boolean result = false;
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		print("Input: "+question);
		try {
			line = buffer.readLine();
			if(line.equals("y") || line.equals("yes")){
				result = true;
			}
		} catch (IOException anEx) {
			// TODO Auto-generated catch block
			anEx.printStackTrace();
		}
		return result;
	}
}
