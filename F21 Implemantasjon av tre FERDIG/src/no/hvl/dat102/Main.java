package no.hvl.dat102;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		/*
		   Konstruerer eit binært tre som ser slik ut
		  
		         5
		        / \
		       1   7 
		  
		 */
		
		BinaerTre<Integer> t1 = new BinaerTre<>(1);
		BinaerTre<Integer> t2 = new BinaerTre<>(7);
		BinaerTre<Integer> t3 = new BinaerTre<>(5, t1, t2);

		/*
		   Konstruerer eit binært tre som ser slik ut
		  
		         15
		        / \
		       11   17 
		  
		 */
		BinaerTre<Integer> t4 = new BinaerTre<>(11);
		BinaerTre<Integer> t5 = new BinaerTre<>(17);
		BinaerTre<Integer> t6 = new BinaerTre<>(15, t4, t5);
		
		/*
		   Lag eit tre med 0 som rot og t3 som venstre undertre og t6 som høgre undertre
		  
		         0
		        / \
		      t3   t6 
		  
		 */
		BinaerTre<Integer> t7 = new BinaerTre<>(0, t3, t6);
		
		Iterator<Integer> it = t3.getInordenIterator();


		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (Integer e : t7) {
			System.out.print(e + " " );
		}
		System.out.println();
		System.out.println("Antall på nivå 3: " + t7.getAntallPaaNivaa(3));
		
		// Eksempel der vi brukar ei utvida for-løkke for å finne summen av tala i treet
		// Denne brukar iterator-metoden i BinaerTre-klassen. Denne returnerer ein Inorden-iterator.
		int sum = 0;
		for (Integer e : t7) {
			sum += e;
		}
		
		System.out.println("Summen er: " + sum);
	}
}
