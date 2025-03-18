package no.hvl.dat102.ordbok;

import java.util.Iterator;

public class Main_Frekvens {
	
	public static void main(String[] args) {
		
		// Testdata
		String[] ord = {"er", "det", "finn", "er", "finn", "er"};
		
		// Lag ordbok
		Ordbok<String, Integer> frekvenser = new Ordbok<>();
		
		// Tell opp
		for (String e : ord) {
			Integer verdi = frekvenser.getVerdi(e);
			if (verdi == null) {
				frekvenser.leggTil(e, 1);
			} else {
				frekvenser.leggTil(e, verdi + 1);
			}
		}
			
		// Skriv frekvensoversikt
		Iterator<String> nIt = frekvenser.getNokkelIterator();
		Iterator<Integer> vIt = frekvenser.getVerdiIterator();
		
		while (nIt.hasNext()) {
			System.out.println(nIt.next() + ": " + vIt.next());
		}
	}

}

