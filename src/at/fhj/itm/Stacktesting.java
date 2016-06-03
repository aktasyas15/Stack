package at.fhj.itm;
/**
 * 
 * 
 * @author Yasin A
 * @version 03.06.2016
 * 
 */
public class Stacktesting {

	
		/**
		 * 
		 * 
		 * @return System.out(), to show the "Wert", 
		 * gives the Output with the result of the Push and Pop function 
		 * @param s1= a Stack from the class "StringStack(=a vector)
		 * @param wert= the result of s1.pop()
		 */
		public static void main(String[] args) {
			StringStack s1 = new StringStack();
			
			
			String wert = s1.pop();
			System.out.println("Pop Aufruf bei leerem Stack" + wert );
			
			//autruf push methoden
			s1.push("YASIN ");
			s1.push("AKTAS ");
			
			//Aufruf pop methode
			String wert2 = s1.pop();
			
			System.out.println("Pop Aufruf--> das ergebnis sollte AKTAS sein " + wert2 );

		String wert3 = s1.pop();
		System.out.println("Pop Aufruf--> das ergebnis sollte Yasin sein " + wert3 );
		}
		
	}



